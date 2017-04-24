package com.art.character.Enemies;

import com.art.character.Character;

public class Enemy extends Character {
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    public Enemy(String name, int level, int strength, int agility, int intelligence, int vitality) {
        super(name, level, strength, agility, intelligence, vitality);
    }

    public Enemy() {

    }

    public void calculatedStats() {
    }

    @Override
    public void calculateMana() {
        setMana(getIntelligence()*5);
    }

    @Override
    public void calculateHealth() {
        setHealth(getVitality()*13+getStrength());
    }

    @Override
    public void calculateAttack() {
    }

    @Override
    public void calculateDefense() {
        setDefense(getAgility()*2);
    }


}
