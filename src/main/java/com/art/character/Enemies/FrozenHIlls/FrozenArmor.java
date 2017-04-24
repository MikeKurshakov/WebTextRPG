package com.art.character.Enemies.FrozenHIlls;

import com.art.character.Enemies.StrengthEnemy;

public class FrozenArmor extends StrengthEnemy {
    public FrozenArmor(String frozenArmor, int level, int strength, int agility, int intelligence, int vitality) {
        super(frozenArmor, level, strength, agility, intelligence, vitality);
    }

    @Override
    public void calculatedStats() {
        int level = getLevel();
        setAgility(getAgility() + level * 3);
        setStrength(getStrength() * level * 2);
        setIntelligence((int) (getIntelligence() + level * 0.5));
        setVitality((int) (getVitality() + level * Math.PI));
        calculateAttack();
        calculateDefense();
        calculateHealth();
        calculateMana();

    }
}
