package com.art.model;

import javax.persistence.*;

@Entity
public class Userdetails {
    private int id;
    private int level;
    private String type;
    private String items;
    private String wearingItems;

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", level=" + level +
                ", type='" + type + '\'' +
                ", items='" + items + '\'' +
                ", wearingItems='" + wearingItems + '\'' +
                ", strength=" + strenght +
                ", vitality=" + vitality +
                ", agility=" + agility +
                ", intelligence=" + intelligence +

                ", exp=" + exp +
                ", point=" + point +
                '}';
    }

    private Integer strenght;
    private Integer vitality;
    private Integer agility;
    private Integer intelligence;
    private User userById;
    private int exp;
    private int point;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Exp")
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }


    @Basic
    @Column(name = "Point")
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }


    @Basic
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "items")
    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Basic
    @Column(name = "wearing_items")
    public String getWearingItems() {
        return wearingItems;
    }

    public void setWearingItems(String wearingItems) {
        this.wearingItems = wearingItems;
    }

    @Basic
    @Column(name = "strenght")
    public Integer getStrenght() {
        return strenght;
    }

    public void setStrenght(Integer strenght) {
        this.strenght = strenght;
    }

    @Basic
    @Column(name = "vitality")
    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    @Basic
    @Column(name = "agility")
    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    @Basic
    @Column(name = "intelligence")
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userdetails that = (Userdetails) o;

        if (id != that.id) return false;
        if (level != that.level) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (items != null ? !items.equals(that.items) : that.items != null) return false;
        if (wearingItems != null ? !wearingItems.equals(that.wearingItems) : that.wearingItems != null) return false;
        if (strenght != null ? !strenght.equals(that.strenght) : that.strenght != null) return false;
        if (vitality != null ? !vitality.equals(that.vitality) : that.vitality != null) return false;
        if (agility != null ? !agility.equals(that.agility) : that.agility != null) return false;
        if (intelligence != null ? !intelligence.equals(that.intelligence) : that.intelligence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + level;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (wearingItems != null ? wearingItems.hashCode() : 0);
        result = 31 * result + (strenght != null ? strenght.hashCode() : 0);
        result = 31 * result + (vitality != null ? vitality.hashCode() : 0);
        result = 31 * result + (agility != null ? agility.hashCode() : 0);
        result = 31 * result + (intelligence != null ? intelligence.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = true)
    public User getUserById() {
        return userById;
    }

    public void setUserById(User userById) {
        this.userById = userById;
    }
}
