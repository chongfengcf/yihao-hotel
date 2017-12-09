package com.jiudian.room.service;

import com.jiudian.core.base.BaseService;
import com.jiudian.room.entity.RoomType;

public interface RoomTypeManageService extends BaseService<RoomType> {
    public void saveroomtype(String id, String roomTypeName, String roomTypeDescription);
}
