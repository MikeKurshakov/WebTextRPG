package com.art.character.Enemies.FrozenHIlls;

import com.art.character.Enemies.AgilityEnemy;

public class Sabletooth extends AgilityEnemy {

    public Sabletooth(String sabletooth, int level, int strength, int agility, int intelligence, int vitality) {
        super(sabletooth, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 6);
        setStrength((int) (getStrength() + level * Math.E));
        setIntelligence(getIntelligence() + level);
        setVitality((getVitality() + level));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
