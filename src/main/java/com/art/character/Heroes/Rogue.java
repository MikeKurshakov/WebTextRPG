package com.art.character.Heroes;

public class Rogue extends Player {
    public Rogue(String name) {
        setName(name);
        setLevel(1);
        setStrength(20);
        setAgility(30);
        setIntelligence(10);
        setVitality(13);
        setTime(0);
        calculateAttack();
        calculateMana();
        calculateHealth();
        calculateDefense();
    }

    public Rogue() {

    }

    @Override
    public String toString() {
        return "Rogue{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                ", strength=" + getStrength() +
                ", agility=" + getAgility() +
                ", intelligence=" + getIntelligence() +
                ", vitality=" + getVitality() +
                ", attack=" + getAttack() +
                ", health=" + getHealth() +
                ", mana=" + getMana() +
                ", defense=" + getDefense() +
                ", time=" + getTime() +
                '}';
    }
}
