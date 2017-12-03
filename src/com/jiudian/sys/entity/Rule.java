package com.jiudian.sys.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_rulekey")
public class Rule extends BaseEntity {
    /**
     * 兼容类版本
     */
    private static final long serialVersionUID = 1L;

    /**
     * 权限简短编号
     */
    @Column(nullable=false,unique=true,name="num")
    private Integer num;

    /**
     * 权限名字
     */
    @Column(name="rulename")
    private String rulename;

    /**
     * 控制路径
     */
    @Column(name="way")
    private String way;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
