
package com.jiudian.room.service.Impl;

import com.jiudian.core.base.BaseDao;
import com.jiudian.core.base.BaseServiceImpl;
import com.jiudian.room.dao.RoomDao;
import com.jiudian.room.entity.Room;
import com.jiudian.room.service.RoomManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("roomservice")
@Transactional
public class RoomManageServiceImpl extends BaseServiceImpl<Room> implements RoomManageService{

    @Autowired
    private RoomDao roomDao;

    @Override
    public void findAllRoom() {
        List<Room> alllist = getAll();
        List<Room> findlist = findBySql("SELECT * FROM room Order By roomName limit 10,10");
        System.out.println(6666);
    }

    @Override
    public BaseDao<Room> getBaseDao() {
        return roomDao;
    }
}

