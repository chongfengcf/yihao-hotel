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
    private Collection<Checkin> checkinsByCustomerId;

    @OneToMany(mappedBy = "customerByCustomerId")
    private Collection<Custody> custodiesByCustomerId;

    @ManyToOne
    @JoinColumn(name = "vipID", referencedColumnName = "id")
    private Vip vipByVipId;

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

    public Vip getVipByVipId() {
        return vipByVipId;
    }

    public void setVipByVipId(Vip vipByVipId) {
        this.vipByVipId = vipByVipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
