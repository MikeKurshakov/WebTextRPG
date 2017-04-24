package com.art.character.Enemies.FrozenHIlls;

import com.art.character.Enemies.StrengthEnemy;

public class Dragon extends StrengthEnemy {

    public Dragon(String dragon, int level, int strength, int agility, int intelligence, int vitality) {
        super(dragon, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 2);
        setStrength(getStrength() * level * 4);
        setIntelligence((int) (getIntelligence() + level));
        setVitality((int) (getVitality() + level * Math.PI * 1.3));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();

    }
}
