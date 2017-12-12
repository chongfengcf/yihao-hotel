package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;
import com.jiudian.vip.entity.Vip;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class Booking extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "arrivalDate")
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;

    @Column(name = "bookingDate")
    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @ManyToOne
    @JoinColumn(name = "vipPhone", referencedColumnName = "phone")
    private Vip vipByVipId;

    @ManyToOne
    @JoinColumn(name = "roomID", referencedColumnName = "id")
    private Room roomByRoomId;

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Vip getVipByVipId() {
        return vipByVipId;
    }

    public void setVipByVipId(Vip vipByVipId) {
        this.vipByVipId = vipByVipId;
    }

    public Room getRoomByRoomId() {
        return roomByRoomId;
    }

    public void setRoomByRoomId(Room roomByRoomId) {
        this.roomByRoomId = roomByRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking that = (Booking) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
