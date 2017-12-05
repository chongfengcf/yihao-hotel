package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "booking")
public class Booking extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "arrivalDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalDate;

    @Column(name = "leaveDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date leaveDate;

    @Column(name = "days")
    private Integer days;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "id")
    private Customer customerByCustomerId;

    @ManyToOne
    @JoinColumn(name = "roomID", referencedColumnName = "id")
    private Room roomByRoomId;



    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
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
        return Objects.equals(arrivalDate, that.arrivalDate) &&
                Objects.equals(leaveDate, that.leaveDate) &&
                Objects.equals(days, that.days);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalDate, leaveDate, days);
    }
}
