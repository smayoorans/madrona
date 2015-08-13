package org.madrona.common;

import org.madrona.common.enumz.HouseColor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "house")
public class House extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private HouseColor color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HouseColor getColor() {
        return color;
    }

    public void setColor(HouseColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
