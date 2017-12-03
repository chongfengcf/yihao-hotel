package com.jiudian.room.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
    @Column(name = "roomType")
    private String roomType;

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

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
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
}
