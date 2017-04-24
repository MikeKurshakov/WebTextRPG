package com.art.character.Enemies.Barrens;


import com.art.character.Enemies.IntelligenceEnemy;


public class Mummy extends IntelligenceEnemy {

    public Mummy(String mummy, int level, int strength, int agility, int intelligence, int vitality) {
        super(mummy, level, strength, agility, intelligence, vitality);

    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 2);
        setStrength(getStrength() + level * 2);
        setIntelligence((int) (getIntelligence() + level * 3));
        setVitality((int) (getVitality() + level * 1.4));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
