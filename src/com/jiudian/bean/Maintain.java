package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;
import com.jiudian.room.entity.Room;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "maintain")
public class Maintain extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @Column(name = "maintainType")
    private String maintainType;

    @Column(name = "maintainTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date maintainTime;

    @Column(name = "maintainState")
    private String maintainState;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "roomID", referencedColumnName = "id")
    private Room roomByRoomId;

    public String getMaintainType() {
        return maintainType;
    }

    public void setMaintainType(String maintainType) {
        this.maintainType = maintainType;
    }

    public Date getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Date maintainTime) {
        this.maintainTime = maintainTime;
    }

    public String getMaintainState() {
        return maintainState;
    }

    public void setMaintainState(String maintainState) {
        this.maintainState = maintainState;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        Maintain that = (Maintain) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
