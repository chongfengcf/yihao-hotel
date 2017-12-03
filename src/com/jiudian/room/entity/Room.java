package com.jiudian.room.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Objects;

/**
 * 房间表
 */

@Entity
@Table(name="room")
public class Room extends BaseEntity{
    /**
     * 兼容类版本
     */
    private static final long serialVersionUID = 1L;

    /**
     * 房间价格
     */
    @Column(name = "roomPrice")
    private double roomPrice;

    /**
     * 房间电话
     */
    @Column(name = "roomPhone")
    private String roomPhone;

    /**
     * 房间类型
     */
    @ManyToOne
    @JoinColumn(name = "roomTypeId")
    private RoomType roomTypeId;

    /**
     * 房间状态
     */
    @Column(name = "roomState")
    private String roomState;

    /**
     * 房间描述
     */
    @Column(name = "roomDescription")
    private String roomDescription;

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomPhone() {
        return roomPhone;
    }

    public void setRoomPhone(String roomPhone) {
        this.roomPhone = roomPhone;
    }

    public RoomType getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(RoomType roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Double.compare(room.roomPrice, roomPrice) == 0 &&
                Objects.equals(roomPhone, room.roomPhone) &&
                Objects.equals(roomTypeId, room.roomTypeId) &&
                Objects.equals(roomState, room.roomState) &&
                Objects.equals(roomDescription, room.roomDescription);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roomPrice, roomPhone, roomTypeId, roomState, roomDescription);
    }
}
