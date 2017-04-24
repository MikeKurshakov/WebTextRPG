package com.art.character.Heroes;

public class Mage extends Player {

    public Mage(String name) {

        setName( name);
        setLevel(1);
        setStrength(10);
        setAgility(10);
        setIntelligence( 30);
        setVitality(20);
        setTime(0);
        calculateAttack();
        calculateMana();
        calculateHealth();
        calculateDefense();
    }

    public Mage() {

    }

    @Override
    public String toString() {
        return "Mage{" +
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
