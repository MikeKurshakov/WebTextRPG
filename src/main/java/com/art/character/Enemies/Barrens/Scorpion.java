package com.art.character.Enemies.Barrens;

import com.art.character.Enemies.AgilityEnemy;

public class Scorpion extends AgilityEnemy {

    public Scorpion(String scorpion, int level, int strength, int agility, int intelligence, int vitality) {
        super(scorpion, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 4);
        setStrength(getStrength() + (int) (level * 1.5));
        setIntelligence(getIntelligence() + level);
        setVitality((int) (getVitality() + level * 1.8));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
