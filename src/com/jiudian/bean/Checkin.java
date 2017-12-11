package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.customer.entity.Customer;
import com.jiudian.room.entity.Room;
import com.jiudian.vip.entity.Vip;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "checkin")
public class Checkin extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "arrivalDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrivalDate;

    @Column(name = "days")
    private String days;

    @Column(name = "accesscardID")
    private String accesscardId;

    @Column(name = "totalCosts", precision = 2)
    private Double totalCosts;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "staffID", referencedColumnName = "id")
    private Staff staffByStaffId;

    @ManyToOne
    @JoinColumn(name = "vipID", referencedColumnName = "id")
    private Vip vipByvipId;

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

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getAccesscardId() {
        return accesscardId;
    }

    public void setAccesscardId(String accesscardId) {
        this.accesscardId = accesscardId;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(Double totalCosts) {
        this.totalCosts = totalCosts;
    }

    public Staff getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(Staff staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }

    public Vip getVipByvipId() {
        return vipByvipId;
    }

    public void setVipByvipId(Vip vipByvipId) {
        this.vipByvipId = vipByvipId;
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
        Checkin that = (Checkin) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
