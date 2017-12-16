package com.jiudian.room.entity;

import com.jiudian.bean.Checkin;
import com.jiudian.booking.entity.Booking;
import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "room")
public class Room extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "roomName")
    private String roomName;

    @Column(name = "roomPrice", precision = 2)
    private Double roomPrice;

    @Column(name = "roomPhone")
    private String roomPhone;

    @Column(name = "roomState")
    private String roomState;

    @Column(name = "roomAble")
    private String roomAble;

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Checkin> checkinsByRoomId;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Booking> bookingsByRoomId;

    @ManyToOne
    @JoinColumn(name = "roomTypeId", referencedColumnName = "id")
    private RoomType roomTypeByRoomTypeId;


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }


    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }


    public String getRoomPhone() {
        return roomPhone;
    }

    public void setRoomPhone(String roomPhone) {
        this.roomPhone = roomPhone;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }


    public Collection<Checkin> getCheckinsByRoomId() {
        return checkinsByRoomId;
    }

    public void setCheckinsByRoomId(Collection<Checkin> checkinsByRoomId) {
        this.checkinsByRoomId = checkinsByRoomId;
    }

    public RoomType getRoomTypeByRoomTypeId() {
        return roomTypeByRoomTypeId;
    }

    public void setRoomTypeByRoomTypeId(RoomType roomTypeByRoomTypeId) {
        this.roomTypeByRoomTypeId = roomTypeByRoomTypeId;
    }

    public String getRoomAble() {
        return roomAble;
    }

    public void setRoomAble(String roomAble) {
        this.roomAble = roomAble;
    }

    public Collection<Booking> getBookingsByRoomId() {
        return bookingsByRoomId;
    }

    public void setBookingsByRoomId(Collection<Booking> bookingsByRoomId) {
        this.bookingsByRoomId = bookingsByRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = (Room) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
