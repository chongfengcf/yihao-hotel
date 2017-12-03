package com.jiudian.sys.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "sys_user")
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
     * 姓名
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户类型，0为管理员，1为工作人员
     */
    @Column(name = "type")
    private String type;

    /**
     * 能够登录
     */
    @Column(name = "able")
    private int able;

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
}
