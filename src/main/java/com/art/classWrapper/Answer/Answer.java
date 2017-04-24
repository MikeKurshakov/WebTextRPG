package com.art.classWrapper.Answer;

/**
 * Created by usenk on 13.04.2017.
 */
public class Answer {
    private int enemyHealth;
    private int playerHealth;
    private String location;
    public Answer() {
    }

    public Answer(int health, int health1, String location) {
        this.enemyHealth = health1;
        this.playerHealth = health;
        this.location = location;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }


}
