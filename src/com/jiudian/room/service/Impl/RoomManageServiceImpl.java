
package com.jiudian.room.service.Impl;

import com.alibaba.fastjson.JSON;
import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.dao.RoomDao;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import com.jiudian.util.JsonReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("RoomManageService")
@Transactional
public class RoomManageServiceImpl extends BaseServiceImpl<Room> implements RoomManageService{

    @Autowired
    private RoomDao roomDao;

    @Autowired
    private JsonReturn jsonReturn;

    @Override
    public String roomPagination(int page, int limit) {
        List rooms = pagingBySql("SELECT * FROM room ORDER BY roomName", (page-1)*10, limit);
        jsonReturn.setData(rooms);
        jsonReturn.setCount(3);
        jsonReturn.setCode(0);
        String jsonstring = JSON.toJSONString(jsonReturn);
        return jsonstring;
    }

    @Override
    public BaseDao<Room> getBaseDao() {
        return roomDao;
    }
}

