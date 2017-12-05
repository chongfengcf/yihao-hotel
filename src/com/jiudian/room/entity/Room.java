package com.jiudian.room.entity;

import com.jiudian.bean.Booking;
import com.jiudian.bean.Checkin;
import com.jiudian.bean.Items;
import com.jiudian.bean.Maintain;
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

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<RoomType> roomTypeByRoomId;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Booking> bookingsByRoomId;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Checkin> checkinsByRoomId;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Items> itemsByRoomId;

    @OneToMany(mappedBy = "roomByRoomId")
    private Collection<Maintain> maintainsByRoomId;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(roomName, room.roomName) &&
                Objects.equals(roomPrice, room.roomPrice) &&
                Objects.equals(roomPhone, room.roomPhone) &&
                Objects.equals(roomState, room.roomState) &&
                Objects.equals(notes, room.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roomName, roomPrice, roomPhone, roomState, notes);
    }

    public Collection<Booking> getBookingsByRoomId() {
        return bookingsByRoomId;
    }

    public void setBookingsByRoomId(Collection<Booking> bookingsByRoomId) {
        this.bookingsByRoomId = bookingsByRoomId;
    }

    public Collection<Checkin> getCheckinsByRoomId() {
        return checkinsByRoomId;
    }

    public void setCheckinsByRoomId(Collection<Checkin> checkinsByRoomId) {
        this.checkinsByRoomId = checkinsByRoomId;
    }

    public Collection<Items> getItemsByRoomId() {
        return itemsByRoomId;
    }

    public void setItemsByRoomId(Collection<Items> itemsByRoomId) {
        this.itemsByRoomId = itemsByRoomId;
    }

    public Collection<Maintain> getMaintainsByRoomId() {
        return maintainsByRoomId;
    }

    public void setMaintainsByRoomId(Collection<Maintain> maintainsByRoomId) {
        this.maintainsByRoomId = maintainsByRoomId;
    }

    public Collection<RoomType> getRoomTypeByRoomId() {
        return roomTypeByRoomId;
    }

    public void setRoomTypeByRoomId(Collection<RoomType> roomTypeByRoomId) {
        this.roomTypeByRoomId = roomTypeByRoomId;
    }
}
