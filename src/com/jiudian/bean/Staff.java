package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.sys.entity.SysUser;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "staff")
public class Staff extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Column(name = "staffName")
    private String staffName;

    @Column(name = "staffPhone")
    private String staffPhone;

    @Column(name = "staffAddress")
    private String staffAddress;

    @Column(name = "staffAge")
    private String staffAge;

    @Column(name = "staffType")
    private String staffType;

    @Column(name = "staffEntryTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date staffEntryTime;

    @Column(name = "staffAble")
    private String staffAble;

    @OneToMany(mappedBy = "staffByStaffId")
    private Collection<Checkin> checkinsByStaffId;

    @ManyToOne
    @JoinColumn(name = "sys_userID", referencedColumnName = "id")
    private SysUser sysUserBysysUserId;

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public Date getStaffEntryTime() {
        return staffEntryTime;
    }

    public void setStaffEntryTime(Date staffEntryTime) {
        this.staffEntryTime = staffEntryTime;
    }

    public String getStaffAble() {
        return staffAble;
    }

    public void setStaffAble(String staffAble) {
        this.staffAble = staffAble;
    }

    public Collection<Checkin> getCheckinsByStaffId() {
        return checkinsByStaffId;
    }

    public void setCheckinsByStaffId(Collection<Checkin> checkinsByStaffId) {
        this.checkinsByStaffId = checkinsByStaffId;
    }

    public SysUser getSysUserBysysUserId() {
        return sysUserBysysUserId;
    }

    public void setSysUserBysysUserId(SysUser sysUserBysysUserId) {
        this.sysUserBysysUserId = sysUserBysysUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffName, staff.staffName) &&
                Objects.equals(staffPhone, staff.staffPhone) &&
                Objects.equals(staffAddress, staff.staffAddress) &&
                Objects.equals(staffAge, staff.staffAge) &&
                Objects.equals(staffType, staff.staffType) &&
                Objects.equals(staffEntryTime, staff.staffEntryTime) &&
                Objects.equals(staffAble, staff.staffAble);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffName, staffPhone, staffAddress, staffAge, staffType, staffEntryTime, staffAble);
    }
}
