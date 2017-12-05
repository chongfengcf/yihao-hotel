package com.jiudian.room.service;

import com.jiudian.core.base.BaseService;
import com.jiudian.room.entity.Room;

public interface RoomManageService extends BaseService<Room>{
    public void findAllRoom();
}
