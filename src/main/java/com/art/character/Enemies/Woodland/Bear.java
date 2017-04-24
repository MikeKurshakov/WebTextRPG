package com.art.character.Enemies.Woodland;

import com.art.character.Enemies.StrengthEnemy;

public class Bear extends StrengthEnemy {
    public Bear(String bear, int level, int strength, int agility, int intelligence, int vitality) {
        super(bear, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level=getLevel();
        setAgility(getAgility()+level);
        setStrength((int)(getStrength()*level*2));
        setIntelligence((int) (getIntelligence()+level*0.5));
        setVitality((int) (getVitality()+level*Math.E));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();

    }
}
