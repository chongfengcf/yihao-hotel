package com.jiudian.room.vo;

import com.jiudian.room.entity.RoomType;

public class RoomTypeVo {
    private String id;
    private String roomTypeName;

    public RoomTypeVo(RoomType roomType) {
        this.id = roomType.getId();
        this.roomTypeName = roomType.getRoomTypeName();
    }

    public RoomTypeVo(String id, String roomTypeName) {
        this.id = id;
        this.roomTypeName = roomTypeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }
}
