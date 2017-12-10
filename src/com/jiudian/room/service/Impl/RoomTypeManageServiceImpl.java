package com.jiudian.room.service.Impl;

import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.dao.RoomTypeDao;
import com.jiudian.room.entity.Room;
import com.jiudian.room.entity.RoomType;
import com.jiudian.room.service.RoomTypeManageService;
import com.jiudian.room.vo.RoomTypeVo;
import com.jiudian.util.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("RoomTypeManageService")
@Transactional
public class RoomTypeManageServiceImpl extends BaseServiceImpl<RoomType> implements RoomTypeManageService {

    @Autowired
    private RoomTypeDao roomTypeDao;

    @Override
    public void saveroomtype(String id, String roomTypeName, String roomTypeDescription) {
        RoomType roomType;
        if("".equals(id)) {
            roomType = new RoomType();
        }
        else {
            roomType = get(id);
        }
        roomType.setRoomTypeName(roomTypeName);
        roomType.setRoomTypeDescription(roomTypeDescription);
        saveOrUpdate(roomType);
    }

    @Override
    public List<RoomTypeVo> getroomtypelist() {
        List<RoomType> roomtypes = getAll();
        List<RoomTypeVo> roomTypeVos = new ArrayList<>();
        for(RoomType temp : roomtypes) {
            roomTypeVos.add(new RoomTypeVo(temp));
        }
        return roomTypeVos;
    }

    @Override
    public void delroom(RoomType roomType) {
        Collection<Room> rooms = roomType.getRoomsByroomTypeId();
        for(Room temp : rooms) {
            temp.setRoomTypeByroomTypeId(null);
        }
    }

    @Override
    public BaseDao<RoomType> getBaseDao() {
        return roomTypeDao;
    }
}