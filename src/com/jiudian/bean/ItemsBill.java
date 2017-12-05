package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_items_bill")
public class ItemsBill extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "billID", referencedColumnName = "id")
    private Bill billByBillId;

    @ManyToOne
    @JoinColumn(name = "itemsID", referencedColumnName = "id")
    private Items itemsByItemsId;

    @Column(name = "num")
    private int num;

    @Column(name = "unit")
    private String unit;

    @Column(name = "totalPrice")
    private double totalPrice;

    @Column(name = "notes")
    private String notes;

    public Bill getBillByBillId() {
        return billByBillId;
    }

    public void setBillByBillId(Bill billByBillId) {
        this.billByBillId = billByBillId;
    }

    public Items getItemsByItemsId() {
        return itemsByItemsId;
    }

    public void setItemsByItemsId(Items itemsByItemsId) {
        this.itemsByItemsId = itemsByItemsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getTotalPrice() {
        return totalPrice;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemsBill itemsBill = (ItemsBill) o;
        return num == itemsBill.num &&
                Double.compare(itemsBill.totalPrice, totalPrice) == 0 &&
                Objects.equals(unit, itemsBill.unit) &&
                Objects.equals(notes, itemsBill.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, unit, totalPrice, notes);
    }
}
