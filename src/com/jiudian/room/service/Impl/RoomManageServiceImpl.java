
package com.jiudian.room.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.dao.RoomDao;
import com.jiudian.room.dao.RoomTypeDao;
import com.jiudian.room.entity.Room;
import com.jiudian.room.entity.RoomType;
import com.jiudian.room.service.RoomManageService;
import com.jiudian.room.service.RoomTypeManageService;
import com.jiudian.room.vo.RoomVo;
import com.jiudian.core.util.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service("RoomManageService")
@Transactional
public class RoomManageServiceImpl extends BaseServiceImpl<Room> implements RoomManageService{

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private RoomTypeDao roomTypeDao;

    @Override
    public String roomPagination(int page, int limit) {
        JsonReturn jsonReturn = new JsonReturn();
        List<Room> rooms = pagingBySql("SELECT * FROM room ORDER BY roomName", (page-1)*10, limit);
        List<RoomVo> roomVos = new ArrayList<>();
        for(Room temp : rooms) {
            roomVos.add(new RoomVo(temp));
        }
        jsonReturn.setData(roomVos);
        jsonReturn.setCount(rowCount("room"));
        String jsonstring = JSON.toJSONString(jsonReturn);
        return jsonstring;
    }

    @Override
    public void saveroom(String id, String roomName, String roomPhone, String roomTypeId, Double roomPrice, String roomAble, String notes) {
        Room room;
        RoomType roomType;

        if("".equals(id)) {
            room = new Room();
        }
        else {
            room = get(id);
        }

        if(roomTypeId==null) {
            roomType = new RoomType();
            roomType.setRoomTypeName("未分类");
            roomTypeDao.save(roomType);
        }else {
            roomType = roomTypeDao.get(roomTypeId);
        }
        room.setRoomTypeByRoomTypeId(roomType);
        room.setRoomName(roomName);
        room.setRoomPhone(roomPhone);
        room.setRoomPrice(roomPrice);
        room.setRoomAble(roomAble);
        room.setNotes(notes);
        room.setRoomState("空房");
        saveOrUpdate(room);
    }

    @Override
    public List<Room> findRoom(String parameter) {
        List<Room> list = roomDao.findBySql("select * from room where roomTypeId = ?0 order by roomAble desc",parameter);
        return list;
    }

    @Override
    public BaseDao<Room> getBaseDao() {
        return roomDao;
    }
}

