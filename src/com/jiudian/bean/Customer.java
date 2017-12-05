package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerPhone")
    private String customerPhone;

    @Column(name = "customerAddress")
    private String customerAddress;

    @Column(name = "customerCard")
    private String customerCard;

    @Column(name = "customerSex")
    private String customerSex;

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<Booking> bookingsByCustomerId;

    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<Checkin> checkinsByCustomerId;

    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<Custody> custodiesByCustomerId;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCard() {
        return customerCard;
    }

    public void setCustomerCard(String customerCard) {
        this.customerCard = customerCard;
    }

    public String getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Collection<Booking> getBookingsByCustomerId() {
        return bookingsByCustomerId;
    }

    public void setBookingsByCustomerId(Collection<Booking> bookingsByCustomerId) {
        this.bookingsByCustomerId = bookingsByCustomerId;
    }

    public Collection<Checkin> getCheckinsByCustomerId() {
        return checkinsByCustomerId;
    }

    public void setCheckinsByCustomerId(Collection<Checkin> checkinsByCustomerId) {
        this.checkinsByCustomerId = checkinsByCustomerId;
    }

    public Collection<Custody> getCustodiesByCustomerId() {
        return custodiesByCustomerId;
    }

    public void setCustodiesByCustomerId(Collection<Custody> custodiesByCustomerId) {
        this.custodiesByCustomerId = custodiesByCustomerId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return Objects.equals(customerName, that.customerName) &&
                Objects.equals(customerPhone, that.customerPhone) &&
                Objects.equals(customerAddress, that.customerAddress) &&
                Objects.equals(customerCard, that.customerCard) &&
                Objects.equals(customerSex, that.customerSex) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerName, customerPhone, customerAddress, customerCard, customerSex, notes);
    }

}
