package com.art.character.Enemies.Boneyard;

import com.art.character.Enemies.AgilityEnemy;


public class Ghoul extends AgilityEnemy {
    public Ghoul(String ghoul, int level, int strength, int agility, int intelligence, int vitality) {
        super(ghoul, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 5);
        setStrength(getStrength() * 2);
        setIntelligence(getIntelligence() + (int) (level * 0.4));
        setVitality((int) (getVitality() + level * 1.5));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
