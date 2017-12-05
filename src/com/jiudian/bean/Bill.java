package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "bill")
public class Bill extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "roomCosts", precision = 2)
    private Double roomCosts;

    @Column(name = "totalCosts", precision = 2)
    private Double totalCosts;

    @Column(name = "payMethode")
    private String payMethode;

    @ManyToOne
    @JoinColumn(name = "checkinID", referencedColumnName = "id")
    private Checkin checkinByCheckinId;

    @OneToMany(mappedBy = "billByBillId")
    private Collection<ItemsBill> itemsbillByBillId;

    public Double getRoomCosts() {
        return roomCosts;
    }

    public void setRoomCosts(Double roomCosts) {
        this.roomCosts = roomCosts;
    }

    public Double getTotalCosts() {
        return totalCosts;
    }

    public void setTotalCosts(Double totalCosts) {
        this.totalCosts = totalCosts;
    }

    public String getPayMethode() {
        return payMethode;
    }

    public void setPayMethode(String payMethode) {
        this.payMethode = payMethode;
    }

    public Checkin getCheckinByCheckinId() {
        return checkinByCheckinId;
    }

    public void setCheckinByCheckinId(Checkin checkinByCheckinId) {
        this.checkinByCheckinId = checkinByCheckinId;
    }

    public Collection<ItemsBill> getItemsbillByBillId() {
        return itemsbillByBillId;
    }

    public void setItemsbillByBillId(Collection<ItemsBill> itemsbillByBillId) {
        this.itemsbillByBillId = itemsbillByBillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill that = (Bill) o;
        return Objects.equals(roomCosts, that.roomCosts) &&
                Objects.equals(totalCosts, that.totalCosts) &&
                Objects.equals(payMethode, that.payMethode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roomCosts, totalCosts, payMethode);
    }
}
