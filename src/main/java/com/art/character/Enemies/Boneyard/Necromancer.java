package com.art.character.Enemies.Boneyard;


import com.art.character.Enemies.IntelligenceEnemy;

public class Necromancer extends IntelligenceEnemy {

    public Necromancer(String necromancer, int level, int strength, int agility, int intelligence, int vitality) {
        super(necromancer, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 2);
        setStrength(getStrength() + level * 1);
        setIntelligence((getIntelligence() + (int) (level * 4.5)));
        setVitality(getVitality() + level);
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();
    }
}
