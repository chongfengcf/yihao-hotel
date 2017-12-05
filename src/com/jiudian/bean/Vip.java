package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "vip")
public class Vip extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "vipPhone", unique = true)
    private String vipPhone;

    @Column(name = "vipCredit")
    private int vipCredit;

    @OneToMany(mappedBy = "vipByvipId")
    private Collection<Checkin> checkinsByvipId;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinTable(name = "tb_customer_vip",
            joinColumns = @JoinColumn(name = "vipPhone", referencedColumnName = "vipPhone"),
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

    public Collection<Checkin> getCheckinsByvipId() {
        return checkinsByvipId;
    }

    public void setCheckinsByvipId(Collection<Checkin> checkinsByvipId) {
        this.checkinsByvipId = checkinsByvipId;
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
        return vipCredit == vip.vipCredit &&
                Objects.equals(vipPhone, vip.vipPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vipPhone, vipCredit);
    }
}
