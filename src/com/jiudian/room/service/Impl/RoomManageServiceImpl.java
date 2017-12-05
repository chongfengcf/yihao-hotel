
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
        int i;
        int j;
        int res;
        for(i=3;i<=10;i++){
            for(j=1;j<=10;j++){
                res = i*100+j*1;
                Room room = new Room();
                room.setRoomName(String.valueOf(res));
                room.setRoomPhone(String.valueOf(res));
                room.setRoomPrice(288.00+i*10);
                save(room);
                room=null;
            }
        }
    }

    @Override
    public BaseDao<Room> getBaseDao() {
        return roomDao;
    }
}

