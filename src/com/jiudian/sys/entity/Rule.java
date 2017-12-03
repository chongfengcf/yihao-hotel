package com.jiudian.sys.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * 控制规则表
 */

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rule rule = (Rule) o;
        return Objects.equals(num, rule.num) &&
                Objects.equals(rulename, rule.rulename) &&
                Objects.equals(way, rule.way);
    }

    @Override
    public int hashCode() {

        return Objects.hash(num, rulename, way);
    }
}
