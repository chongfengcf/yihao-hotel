package com.jiudian.vip.entity;

import com.jiudian.bean.Checkin;
import com.jiudian.core.base.BaseEntity;
import com.jiudian.customer.entity.Customer;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "vip")
public class Vip extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "vipCredit")
    private int vipCredit;
    
    @Column(name = "birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    
    @Column(name = "vipLevel")
    private String vipLevel;
    
    @Column(name = "nums")
    private int nums;
    

    @OneToMany(mappedBy = "vipByvipId")
    private Collection<Checkin> checkinsByvipId;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Customer> customersByVipId;


    public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getVipLevel() {
		return vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
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
