package com.jiudian.checkin.entity;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.customer.entity.Customer;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_checkin")
public class CustomerCheckin extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "id")
    private Customer customerByCustomerId;

    @ManyToOne
    @JoinColumn(name = "checkinID", referencedColumnName = "id")
    private Checkin checkinByCheckinId;

    public Customer getCustomerByCustomerId() {
        return customerByCustomerId;
    }

    public void setCustomerByCustomerId(Customer customerByCustomerId) {
        this.customerByCustomerId = customerByCustomerId;
    }

    public Checkin getCheckinByCheckinId() {
        return checkinByCheckinId;
    }

    public void setCheckinByCheckinId(Checkin checkinByCheckinId) {
        this.checkinByCheckinId = checkinByCheckinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerCheckin that = (CustomerCheckin) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}