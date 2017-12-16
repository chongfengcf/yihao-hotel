package com.jiudian.vip.entity;

import com.jiudian.bean.Checkin;
import com.jiudian.booking.entity.Booking;
import com.jiudian.comment.entity.Comment;
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
    /**
     * 会员手机号同时为用户名.保证唯一
     */
    @Column(name = "phone", unique = true)
    private String phone;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    @Column(name = "vipCredit")
    private int vipCredit;
    
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    
    @Column(name = "vipLevel")
    private String vipLevel;
    
    @Column(name = "nums")
    private int nums;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Checkin> checkinsByVipId;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Customer> customersByVipId;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Booking> bookingsByVipId;

    @OneToMany(mappedBy = "vipByVipId")
    private Collection<Comment> commentsByVipId;


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

    public Collection<Customer> getCustomersByVipId() {
        return customersByVipId;
    }

    public void setCustomersByVipId(Collection<Customer> customersByVipId) {
        this.customersByVipId = customersByVipId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Checkin> getCheckinsByVipId() {
        return checkinsByVipId;
    }

    public void setCheckinsByVipId(Collection<Checkin> checkinsByVipId) {
        this.checkinsByVipId = checkinsByVipId;
    }

    public Collection<Booking> getBookingsByVipId() {
        return bookingsByVipId;
    }

    public void setBookingsByVipId(Collection<Booking> bookingsByVipId) {
        this.bookingsByVipId = bookingsByVipId;
    }

    public Collection<Comment> getCommentsByVipId() {
        return commentsByVipId;
    }

    public void setCommentsByVipId(Collection<Comment> commentsByVipId) {
        this.commentsByVipId = commentsByVipId;
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
