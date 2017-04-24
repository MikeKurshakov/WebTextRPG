package com.art.character.Heroes;

import com.art.character.Character;
import com.art.model.Item;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Player extends Character {

    private int Point;
    private int time;
    private List<Item> itemList = new ArrayList<>();
    private Item[] wearItem = new Item[4];
    private int money;
    private int exp;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Item[] getWearItem() {
        return wearItem;
    }

    public void setWearItem(Item[] wearItem) {
        this.wearItem = wearItem;
    }

    public void addItem(Item item) {
        wearItem[item.getPosition()] = item;
        getItemList().remove(item);
        addStrength(item.getStrength());
        addAgility(item.getAgility());
        addVitality(item.getVitality());
        addIntelligence(item.getIntelligence());
    }

    public void unequip(Item item) {
        wearItem[item.getPosition()] = null;
        equip(item);
        addStrength(-item.getStrength());
        addAgility(-item.getAgility());
        addVitality(-item.getVitality());
        addIntelligence(-item.getIntelligence());
    }

    public void deleteItem(Item item) {
        itemList.remove(item);
    }

    public void equip(Item item) {
        itemList.add(item);
    }

    public void regenHealth() {
        if (getTime() != 0) {
            int regen = (int) (differenceTime(getTime()) * getVitality() * 1.14);
            if (regen > getVitality() * 14) regen = getVitality() * 14;
            else
                regen = getHealth() + regen;
            setHealth(regen);

        }
    }

    private int differenceTime(int time) {
        Date date = new Date();
        setTime((int) date.getTime());
        return ((int) (date.getTime() - time));
    }

    public void regenMana() {

        if (getTime() != 0) {
            int regen = (int) (differenceTime(getTime()) * getIntelligence() * 1.14);
            if (regen > getVitality() * 14) regen = getIntelligence() * 15;
            else
                regen = getMana() + regen;
            setMana(regen);

        }

    }

    public void calculateMana() {
        int mana = getIntelligence() * 15;
        for (Item item : wearItem) {
            if (item != null) mana += item.getMana();
        }
        setMana(mana);
    }

    public void calculateHealth() {
        int health = getVitality() * 14;
        for (Item item : wearItem) {
            if (item != null) health += item.getHealth();
        }
        setHealth(health);
    }

    public void calculateAttack() {
        int attack = getStrength() * 5 + getAgility();
        for (Item item : wearItem) {
            if (item != null) attack += item.getAttack();
        }
        setAttack(attack);
    }

    public void calculateDefense() {
        int defense = getAgility();

        defense /= 7;
        for (Item item : wearItem) {
            if (item != null) defense += item.getDefense();
        }
        setDefense(defense);
    }


    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addExp(int exp) {
        this.exp += exp;
        if (this.exp >= getLevel() * 100) levelUp();
    }

    private void levelUp() {
        while (getExp() > getLevel() * 100) {
            setExp(getExp() - getLevel() * 100);
            setLevel(getLevel() + 1);
            setPoint(getPoint() + 5);
        }
    }

    public void calculateItem(String items, String wearingItems) {

    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPoint() {
        return Point;
    }

    public void setPoint(int point) {
        Point = point;
    }

    public void addStrength(int point) {
        setStrength(getStrength() + point);
        calculateAttack();
    }

    public void addVitality(int point) {
        setVitality(getVitality() + point);
        calculateAttack();
        calculateHealth();
    }

    public void addIntelligence(int point) {
        setIntelligence(getIntelligence() + point);
        calculateAttack();
        calculateMana();
    }

    public void addAgility(int point) {
        setAgility(getAgility() + point);
        calculateAttack();
        calculateDefense();
    }
    public void addMoney(int money) {
        setMoney(getMoney()+money);
    }

    @Override
    public String toString() {
        return "Player{" +

                ", Point=" + Point +
                ", time=" + time +
                ", itemList=" + itemList +
                ", wearItem=" + wearItem +
                ", money=" + money +
                ", exp=" + exp +
                '}';
    }

    public String statsString() {
        return "" + getAgility() + " " + getVitality() + " " + getIntelligence() + " " + getStrength()
                + " " + getAttack() + " " + getDefense() + " " + getHealth() + " " + getMana() + " " + getPoint() + " " + getLevel() + " " + getExp();
    }


}
