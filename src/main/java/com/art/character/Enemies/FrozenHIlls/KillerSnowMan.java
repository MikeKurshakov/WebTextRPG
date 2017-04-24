package com.art.character.Enemies.FrozenHIlls;

import com.art.character.Enemies.IntelligenceEnemy;

public class KillerSnowMan extends IntelligenceEnemy {

    public KillerSnowMan(String killerSnowMan, int level, int strength, int agility, int intelligence, int vitality) {
        super(killerSnowMan, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility((int) (getAgility() + level * 0.5));
        setStrength((int) (getStrength() + level * 1.5));
        setIntelligence((int) (getIntelligence() + level * Math.exp(2.0)));
        setVitality((int) (getVitality() + level * 0.2));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
