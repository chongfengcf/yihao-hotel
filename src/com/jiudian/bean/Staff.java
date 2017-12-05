package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

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
    private Collection<Checkin> staffByStaffId;

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

    public Collection<Checkin> getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(Collection<Checkin> staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (staffName != null ? !staffName.equals(staff.staffName) : staff.staffName != null) return false;
        if (staffPhone != null ? !staffPhone.equals(staff.staffPhone) : staff.staffPhone != null) return false;
        if (staffAddress != null ? !staffAddress.equals(staff.staffAddress) : staff.staffAddress != null) return false;
        if (staffAge != null ? !staffAge.equals(staff.staffAge) : staff.staffAge != null) return false;
        if (staffType != null ? !staffType.equals(staff.staffType) : staff.staffType != null) return false;
        if (staffEntryTime != null ? !staffEntryTime.equals(staff.staffEntryTime) : staff.staffEntryTime != null)
            return false;
        return staffAble != null ? staffAble.equals(staff.staffAble) : staff.staffAble == null;
    }

    @Override
    public int hashCode() {
        int result = staffName != null ? staffName.hashCode() : 0;
        result = 31 * result + (staffPhone != null ? staffPhone.hashCode() : 0);
        result = 31 * result + (staffAddress != null ? staffAddress.hashCode() : 0);
        result = 31 * result + (staffAge != null ? staffAge.hashCode() : 0);
        result = 31 * result + (staffType != null ? staffType.hashCode() : 0);
        result = 31 * result + (staffEntryTime != null ? staffEntryTime.hashCode() : 0);
        result = 31 * result + (staffAble != null ? staffAble.hashCode() : 0);
        return result;
    }
}
