package org.madrona.common;

import org.madrona.common.enumz.HouseColor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "house")
public class House extends PersistentObject {

    @Column(name = "name")
    private String name;

    @Column(name="color")
    private HouseColor color;


    public String getName() {
        return name;
    }

    public void setName(String houseName) {
        this.name = houseName;
    }

    public HouseColor getColor() {
        return color;
    }

    public void setColor(HouseColor houseColor) {
        this.color = houseColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", houseName='" + name + '\'' +
                ", houseColor=" + color +
                '}';
    }
}
