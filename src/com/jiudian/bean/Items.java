package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "items")
public class Items extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "itemsName")
    private String itemsName;

    @Column(name = "itemsPrice", precision = 2)
    private double itemsPrice;

    @Column(name = "itemsType")
    private String itemsType;

    @Column(name = "notes")
    private String notes;

    @OneToMany(mappedBy = "itemsByItemsId")
    private Collection<Extrabill> extrabillsByItemsId;

    @ManyToOne
    @JoinColumn(name = "roomID", referencedColumnName = "id")
    private Room roomByRoomId;

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public double getItemsPrice() {
        return itemsPrice;
    }

    public void setItemsPrice(double itemsPrice) {
        this.itemsPrice = itemsPrice;
    }

    public String getItemsType() {
        return itemsType;
    }

    public void setItemsType(String itemsType) {
        this.itemsType = itemsType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Collection<Extrabill> getExtrabillsByItemsId() {
        return extrabillsByItemsId;
    }

    public void setExtrabillsByItemsId(Collection<Extrabill> extrabillsByItemsId) {
        this.extrabillsByItemsId = extrabillsByItemsId;
    }

    public Room getRoomByRoomId() {
        return roomByRoomId;
    }

    public void setRoomByRoomId(Room roomByRoomId) {
        this.roomByRoomId = roomByRoomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items that = (Items) o;
        return Objects.equals(itemsName, that.itemsName) &&
                Objects.equals(itemsPrice, that.itemsPrice) &&
                Objects.equals(itemsType, that.itemsType) &&
                Objects.equals(notes, that.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(itemsName, itemsPrice, itemsType, notes);
    }
}
