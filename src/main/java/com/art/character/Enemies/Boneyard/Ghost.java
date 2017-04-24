package com.art.character.Enemies.Boneyard;

import com.art.character.Enemies.IntelligenceEnemy;


public class Ghost extends IntelligenceEnemy {

    public Ghost(String ghost, int level, int strength, int agility, int intelligence, int vitality) {
        super(ghost, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 3);
        setStrength((int) (getStrength() + level * 0.8));
        setIntelligence((getIntelligence() + level * 5));
        setVitality((getVitality() + level * 2));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
