package com.art.character;

public class Stats {
    private int strength;
    private int agility;
    private int intelligence;
    private int vitality;
    private int attack;
    private int health;
    private int mana;
    private int defense;

    public Stats() {
    }

    public Stats(int strength, int agility, int intelligence, int vitality) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                ", vitality=" + vitality +
                ", attack=" + attack +
                ", health=" + health +
                ", mana=" + mana +
                ", defense=" + defense +
                '}';
    }

}
