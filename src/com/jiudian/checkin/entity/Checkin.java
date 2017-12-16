package com.jiudian.checkin.entity;

import com.jiudian.bill.entity.Bill;
import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;
import com.jiudian.vip.entity.Vip;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "checkin")
public class Checkin extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "arrivalDate")
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;

    @Column(name = "accesscardID")
    private String accesscardId;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "vipID", referencedColumnName = "id")
    private Vip vipByVipId;

    @ManyToOne
    @JoinColumn(name = "roomID", referencedColumnName = "id")
    private Room roomByRoomId;

    @OneToMany(mappedBy = "checkinByCheckinId")
    private Collection<Bill> billsByRoomId;

    @OneToMany(mappedBy = "checkinByCheckinId")
    private Collection<CustomerCheckin> customerCheckinsById;

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    public Collection<Bill> getBillsByRoomId() {
        return billsByRoomId;
    }

    public void setBillsByRoomId(Collection<Bill> billsByRoomId) {
        this.billsByRoomId = billsByRoomId;
    }

    public Collection<CustomerCheckin> getCustomerCheckinsById() {
        return customerCheckinsById;
    }

    public void setCustomerCheckinsById(Collection<CustomerCheckin> customerCheckinsById) {
        this.customerCheckinsById = customerCheckinsById;
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
