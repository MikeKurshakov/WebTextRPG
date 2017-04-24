package com.art.character.Enemies.Barrens;

import com.art.character.Enemies.StrengthEnemy;


public class Demon extends StrengthEnemy {

    public Demon(String demon, int level, int strength, int agility, int intelligence, int vitality) {
        super(demon, level, strength, agility, intelligence, vitality);

    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 2);
        setStrength(getStrength() * level * 3);
        setIntelligence((int) (getIntelligence() * 0.5 + level * 0.5));
        setVitality((int) (getVitality() + level * Math.PI * 1.2));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();

    }

}
