package com.art.character.Enemies.Woodland;

import com.art.character.Enemies.AgilityEnemy;


public class Wolf extends AgilityEnemy {

        public Wolf(String wolf, int level, int strength, int agility, int intelligence, int vitality) {
            super(wolf, level, strength, agility, intelligence, vitality);
        }

        @Override
        public void calculatedStats() {
            int level = getLevel();
            setAgility(getAgility() + level * 3);
            setStrength(getStrength() + (level * 2));
            setIntelligence (getIntelligence() + level);
            setVitality((int) (getVitality()+level*Math.E));
            calculateAttack();
            calculateDefense();
            calculateHealth();
            calculateMana();
        }
}
