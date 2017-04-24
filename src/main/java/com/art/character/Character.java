package com.art.character;


/**
 * Класс который определяет всех югитов в игре
 */

public class Character extends Stats {
    private String name;
    private int level;

    public Character(String name, int level, int strength, int agility, int intelligence, int vitality) {
    super(strength, agility, intelligence, vitality);
    setName(name);
    setLevel(level);
    }

    public  Character() {

    }
    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public void calculateMana() {
        int mana = 0;
        setMana(mana);
    }

    public void calculateHealth() {
    }

    public void calculateAttack() {
    }

    public void calculateDefense() {
    }

    public void regenHealth() {
    }

    public void regenMana() {
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level + super.toString();
    }
}
