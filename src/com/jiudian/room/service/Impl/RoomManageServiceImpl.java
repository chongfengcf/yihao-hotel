/*
package com.jiudian.room.service.Impl;

import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.dao.RoomDao;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("roomservice")
@Transactional
public class RoomManageServiceImpl extends BaseServiceImpl<Room> implements RoomManageService{

    @Autowired
    private RoomDao roomDao;

    @Override
    public void findAllRoom() {
        Room room = new Room();
        room.setRoomName("301");
        room.setRoomPhone("301");
    }

    @Override
    public BaseDao<Room> getBaseDao() {
        return roomDao;
    }
}
*/
