package com.art.character.Enemies.Woodland;
import com.art.character.Enemies.StrengthEnemy;

public class Marauder extends StrengthEnemy {

    public Marauder(String marauder, int level, int strength, int agility, int intelligence, int vitality) {
        super(marauder, level, strength, agility, intelligence, vitality);
    }

        @Override
    public void calculatedStats() {
        int level=getLevel();
        setAgility(getAgility()+level*3);
        setStrength((int)(getStrength()*level*1.5));
        setIntelligence(getIntelligence()+level*2);
        setVitality((int) (getVitality()+level*1.5));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();

    }
}
