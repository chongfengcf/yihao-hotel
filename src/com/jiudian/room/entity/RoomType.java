package com.jiudian.room.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
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


    @OneToMany(mappedBy = "roomTypeByroomTypeId")
    private Collection<Room> roomsByroomTypeId;

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

    public Collection<Room> getRoomsByroomTypeId() {
        return roomsByroomTypeId;
    }

    public void setRoomsByroomTypeId(Collection<Room> roomsByroomTypeId) {
        this.roomsByroomTypeId = roomsByroomTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomType that = (RoomType) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
