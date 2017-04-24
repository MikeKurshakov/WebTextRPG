package com.art.model;

import javax.persistence.*;

@Entity
@Table(schema = "rpg",name = "item")
public class Item {
    private int id;
    private String name;
    private int strength;
    private int vitality;
    private int intelligence;
    private int agility;
    private int defense;
    private int attack;
    private int health;
    private int mana;
    private int position;
    private int price;
    private String compatibility;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "strength")
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Basic
    @Column(name = "vitality")
    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    @Basic
    @Column(name = "intelligence")
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Basic
    @Column(name = "agility")
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    @Basic
    @Column(name = "defense")
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Basic
    @Column(name = "attack")
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Basic
    @Column(name = "health")
    public int getHealth() {
        return health;
    }

    public void setHealth(int heakth) {
        this.health = heakth;
    }

    @Basic
    @Column(name = "mana")
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Basic
    @Column(name = "position")
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "compatibility")
    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != item.id) return false;
        if (strength != item.strength) return false;
        if (vitality != item.vitality) return false;
        if (intelligence != item.intelligence) return false;
        if (agility != item.agility) return false;
        if (defense != item.defense) return false;
        if (attack != item.attack) return false;
        if (health != item.health) return false;
        if (mana != item.mana) return false;
        if (position != item.position) return false;
        if (price != item.price) return false;
        if (name != null ? !name.equals(item.name) : item.name != null) return false;
        if (compatibility != null ? !compatibility.equals(item.compatibility) : item.compatibility != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + strength;
        result = 31 * result + vitality;
        result = 31 * result + intelligence;
        result = 31 * result + agility;
        result = 31 * result + defense;
        result = 31 * result + attack;
        result = 31 * result + health;
        result = 31 * result + mana;
        result = 31 * result + position;
        result = 31 * result + price;
        result = 31 * result + (compatibility != null ? compatibility.hashCode() : 0);
        return result;
    }
}
