package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "vip")
public class Vip extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "vipPhone")
    private String vipPhone;

    @Column(name = "vipCredit")
    private int vipCredit;

    @OneToMany(mappedBy = "vipByvipId")
    private Collection<Checkin> checkinsByvipId;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Customer> customersByVipId;


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

    public Collection<Customer> getCustomersByVipId() {
        return customersByVipId;
    }

    public void setCustomersByVipId(Collection<Customer> customersByVipId) {
        this.customersByVipId = customersByVipId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vip that = (Vip) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
