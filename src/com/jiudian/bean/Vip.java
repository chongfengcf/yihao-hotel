package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "vip")
public class Vip extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "vipPhone", unique = true)
    private String vipPhone;

    @Column(name = "vipCredit")
    private int vipCredit;

    @OneToMany(mappedBy = "vipByvipId")
    private Collection<Checkin> vipByvipId;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinTable(name = "tb_customer_vip",
            joinColumns = @JoinColumn(name = "vipPhone"),
            inverseJoinColumns = @JoinColumn(name = "customerId", referencedColumnName = "id")
    )
    @Column(name = "customers")
    private Collection<Customer> customers;


    public String getVipPhone() {
        return vipPhone;
    }

    public void setVipPhone(String vipPhone) {
        this.vipPhone = vipPhone;
    }

    public int getVipCredit() {
        return vipCredit;
    }

    public void setVipCredit(int vipCredit) {
        this.vipCredit = vipCredit;
    }

    public Collection<Checkin> getVipByvipId() {
        return vipByvipId;
    }

    public void setVipByvipId(Collection<Checkin> vipByvipId) {
        this.vipByvipId = vipByvipId;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vip vip = (Vip) o;

        if (vipCredit != vip.vipCredit) return false;
        return vipPhone != null ? vipPhone.equals(vip.vipPhone) : vip.vipPhone == null;
    }

    @Override
    public int hashCode() {
        int result = vipPhone != null ? vipPhone.hashCode() : 0;
        result = 31 * result + vipCredit;
        return result;
    }
}
