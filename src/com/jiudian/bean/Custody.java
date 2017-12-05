package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "custody")
public class Custody extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "saveTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date saveTime;

    @Column(name = "receiveTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiveTime;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "id")
    private Customer customerByCustomerId;

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Custody that = (Custody) o;
        return Objects.equals(saveTime, that.saveTime) &&
                Objects.equals(receiveTime, that.receiveTime) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(saveTime, receiveTime, notes);
    }
}
