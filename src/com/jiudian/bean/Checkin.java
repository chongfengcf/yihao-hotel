package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;

import javax.persistence.*;
import java.util.Collection;
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

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "checkinByCheckinId")
    private Collection<Bill> billsByCheckinId;

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

    @OneToMany(mappedBy = "checkinByCheckinId")
    private Collection<Companion> companionsByCheckinId;

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

    public Collection<Bill> getBillsByCheckinId() {
        return billsByCheckinId;
    }

    public void setBillsByCheckinId(Collection<Bill> billsByCheckinId) {
        this.billsByCheckinId = billsByCheckinId;
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

    public Collection<Companion> getCompanionsByCheckinId() {
        return companionsByCheckinId;
    }

    public void setCompanionsByCheckinId(Collection<Companion> companionsByCheckinId) {
        this.companionsByCheckinId = companionsByCheckinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Checkin that = (Checkin) o;
        return Objects.equals(arrivalDate, that.arrivalDate) &&
                Objects.equals(days, that.days) &&
                Objects.equals(accesscardId, that.accesscardId) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(arrivalDate, days, accesscardId, notes);
    }

}
