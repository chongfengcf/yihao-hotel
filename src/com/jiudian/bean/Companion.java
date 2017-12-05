
package com.jiudian.bean;

import com.jiudian.core.base.BaseEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "companion")
public class Companion extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Column(name = "companionName")
    private String companionName;

    @Column(name = "companionPhone")
    private String companionPhone;

    @Column(name = "companionAddress")
    private String companionAddress;

    @Column(name = "companionCard")
    private String companionCard;

    @Column(name = "companionSex")
    private String companionSex;

    @Column(name = "notes")
    private String notes;

    @ManyToOne
    @JoinColumn(name = "checkinID", referencedColumnName = "id")
    private Checkin checkinByCheckinId;

    public String getCompanionName() {
        return companionName;
    }

    public void setCompanionName(String companionName) {
        this.companionName = companionName;
    }

    public String getCompanionPhone() {
        return companionPhone;
    }

    public void setCompanionPhone(String companionPhone) {
        this.companionPhone = companionPhone;
    }

    public String getCompanionAddress() {
        return companionAddress;
    }

    public void setCompanionAddress(String companionAddress) {
        this.companionAddress = companionAddress;
    }

    public String getCompanionCard() {
        return companionCard;
    }

    public void setCompanionCard(String companionCard) {
        this.companionCard = companionCard;
    }

    public String getCompanionSex() {
        return companionSex;
    }

    public void setCompanionSex(String companionSex) {
        this.companionSex = companionSex;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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
        Companion companion = (Companion) o;
        return Objects.equals(companionName, companion.companionName) &&
                Objects.equals(companionPhone, companion.companionPhone) &&
                Objects.equals(companionAddress, companion.companionAddress) &&
                Objects.equals(companionCard, companion.companionCard) &&
                Objects.equals(companionSex, companion.companionSex) &&
                Objects.equals(notes, companion.notes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(companionName, companionPhone, companionAddress, companionCard, companionSex, notes);
    }

}

