package com.madrona.common.model;

import com.madrona.common.model.enumz.HouseColor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class House implements Serializable {

    private static final long serialVersionUID = -6790693372846798580L;

    @Id
    @GeneratedValue
    private int id;
    private String houseName;
    private HouseColor houseColor;
    private LocalDate createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public HouseColor getHouseColor() {
        return houseColor;
    }

    public void setHouseColor(HouseColor houseColor) {
        this.houseColor = houseColor;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", houseName='" + houseName + '\'' +
                ", houseColor=" + houseColor +
                ", createDate=" + createDate +
                '}';
    }
}
