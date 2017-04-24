package com.art.character.Enemies;

public class IntelligenceEnemy extends Enemy {
    public IntelligenceEnemy(String name, int level, int strength, int agility, int intelligence, int vitality) {
        super(name, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculateMana() {
        setMana(getIntelligence()*7);
    }

    @Override
    public void calculateAttack() {
        setAttack(getIntelligence()*7);
    }
}
