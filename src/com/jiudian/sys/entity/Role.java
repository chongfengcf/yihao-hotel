package com.jiudian.sys.entity;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 角色表
 */

@Entity
@Table(name = "sys_role")
public class Role extends BaseEntity {
    /**
     * 兼容类版本
     */
    private static final long serialVersionUID = 1L;

    /**
     * 角色名
     */
    @Column(name="rolename",unique = true)
    private String rolename;

    /**
     * 角色拥有的权限
     */
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinTable(
            name = "tb_role_rule",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "rule_id", referencedColumnName = "id")
    )
    @Column(name = "rules")
    private Set<Rule> rules = new HashSet<>();

    /**
     * 角色类型，0为管理员，1为酒店前台
     */
    @Column(name = "type")
    private String type;

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Set<Rule> getRules() {
        return rules;
    }

    public void setRules(Set<Rule> rules) {
        this.rules = rules;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(rolename, role.rolename) &&
                Objects.equals(rules, role.rules) &&
                Objects.equals(type, role.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rolename, rules, type);
    }
}
