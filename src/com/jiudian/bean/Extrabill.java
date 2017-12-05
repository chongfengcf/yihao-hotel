package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "extrabill")
public class Extrabill extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "unit")
    private String unit;

    @Column(name = "nums")
    private int nums;

    @Column(name = "totalPrice", precision = 2)
    private double totalPrice;

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "extrabillByExtraBillId")
    private Collection<Bill> billsByExtraBillId;

    @ManyToOne
    @JoinColumn(name = "checkID", referencedColumnName = "id")
    private Checkin checkinByCheckId;

    @ManyToOne
    @JoinColumn(name = "itemsID", referencedColumnName = "id")
    private Items itemsByItemsId;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getNums() {
        return nums;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Collection<Bill> getBillsByExtraBillId() {
        return billsByExtraBillId;
    }

    public void setBillsByExtraBillId(Collection<Bill> billsByExtraBillId) {
        this.billsByExtraBillId = billsByExtraBillId;
    }

    public Checkin getCheckinByCheckId() {
        return checkinByCheckId;
    }

    public void setCheckinByCheckId(Checkin checkinByCheckId) {
        this.checkinByCheckId = checkinByCheckId;
    }

    public Items getItemsByItemsId() {
        return itemsByItemsId;
    }

    public void setItemsByItemsId(Items itemsByItemsId) {
        this.itemsByItemsId = itemsByItemsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extrabill extrabill = (Extrabill) o;
        return nums == extrabill.nums &&
                Double.compare(extrabill.totalPrice, totalPrice) == 0 &&
                Objects.equals(unit, extrabill.unit) &&
                Objects.equals(notes, extrabill.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(unit, nums, totalPrice, notes);
    }
}
