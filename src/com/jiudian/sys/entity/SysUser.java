package com.jiudian.sys.entity;

import com.jiudian.bean.Staff;
import com.jiudian.core.base.BaseEntity;
import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

/**
 * 系统用户表
 */

@Entity
@Table(name = "sysuser")
public class SysUser extends BaseEntity{

    /**
     * 兼容类版本
     */
    private static final long serialVersionUID = 1L;

    /**
     * 账号名
     */
    @Column(name="loginId",unique = true)
    private String loginId;

    /**
     * 昵称
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户类型，0为管理员，1为酒店前台
     */
    @Column(name = "type")
    private String type;

    /**
     * 能够登录
     */
    @Column(name = "able")
    private int able;

    @OneToMany(mappedBy = "sysUserBysysUserId")
    private Collection<Staff> staffsByStaffId;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAble() {
        return able;
    }

    public void setAble(int able) {
        this.able = able;
    }

    public Collection<Staff> getStaffsByStaffId() {
        return staffsByStaffId;
    }

    public void setStaffsByStaffId(Collection<Staff> staffsByStaffId) {
        this.staffsByStaffId = staffsByStaffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser that = (SysUser) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
