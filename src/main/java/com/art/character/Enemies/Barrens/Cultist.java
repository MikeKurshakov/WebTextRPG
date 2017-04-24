package com.art.character.Enemies.Barrens;


import com.art.character.Enemies.IntelligenceEnemy;

public class Cultist extends IntelligenceEnemy {

    public Cultist(String cultist, int level, int strength, int agility, int intelligence, int vitality) {
        super(cultist, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 2);
        setStrength(getStrength() + level * 1);
        setIntelligence((getIntelligence() + level * 4));
        setVitality((int) (getVitality() + level * 0.8));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }


}
