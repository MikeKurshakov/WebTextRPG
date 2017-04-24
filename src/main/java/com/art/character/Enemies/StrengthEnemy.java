package com.art.character.Enemies;


public class StrengthEnemy extends  Enemy {

    public StrengthEnemy(String name, int i, int i1, int i2, int i3, int i4) {
        super(name,i,i1,i2,i3,i4);
    }

    @Override
    public void calculateHealth() {
        setHealth(getVitality()*8+getStrength()*2);
    }

    @Override
    public void calculateAttack() {
        setAttack(getStrength()*3);
    }

    @Override
    public void calculateDefense() {
        setDefense(getAgility()*2+(int) (getStrength()*0.5));
    }
}
