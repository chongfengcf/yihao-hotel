package com.jiudian.room.service;

import com.jiudian.core.base.BaseService;
import com.jiudian.room.entity.Room;

public interface RoomManageService extends BaseService<Room>{
    public String roomPagination(int page, int limit);

    public void saveroom(String id, String roomName, String roomPhone, String roomTypeId, Double roomPrice, String roomAble, String notes);
}
