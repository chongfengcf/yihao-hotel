package com.jiudian.room.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Objects;

/**
 * 房间类型表
 */


@Entity
@Table(name = "room_type")
public class RoomType extends BaseEntity {
    /**
     * 兼容类版本
     */
    private static final long serialVersionUID = 1L;

    /**
     * 房型名称
     */
    @Column(name="roomTypeName")
    private String roomTypeName;

    /**
     * 房型描述
     */
    @Column(name = "roomTypeDescription")
    private String roomTypeDescription;

    @ManyToOne
    @JoinColumn(name = "roomId", referencedColumnName = "id")
    private Room roomByRoomId;

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getRoomTypeDescription() {
        return roomTypeDescription;
    }

    public void setRoomTypeDescription(String roomTypeDescription) {
        this.roomTypeDescription = roomTypeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomType roomType = (RoomType) o;
        return Objects.equals(roomTypeName, roomType.roomTypeName) &&
                Objects.equals(roomTypeDescription, roomType.roomTypeDescription);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roomTypeName, roomTypeDescription);
    }

    public Room getRoomByRoomId() {
        return roomByRoomId;
    }

    public void setRoomByRoomId(Room roomByRoomId) {
        this.roomByRoomId = roomByRoomId;
    }
}
