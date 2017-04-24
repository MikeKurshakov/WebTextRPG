package com.art.init;

import com.art.character.Enemies.Enemy;
import com.art.character.Enemies.Barrens.*;
import com.art.character.Enemies.Boneyard.*;
import com.art.character.Enemies.FrozenHIlls.*;
import com.art.character.Enemies.Woodland.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EnemyConfig {

    @Bean(name = "Cultist")
    @Scope(value = "prototype")
    public Enemy cultist() {

        Enemy cultist = new Cultist("Cultist", 10, 10, 10, 12, 10);
        cultist.calculatedStats();
        return cultist;

    }

    @Bean(name="Demon")
    @Scope(value = "prototype")
    public Enemy demon() {
        Demon demon = new Demon("Demon", 17, 12, 10, 10, 12);
        demon.calculatedStats();
        return demon;
    }

    @Bean(name="Mummy")
    @Scope(value = "prototype")
    public Enemy mummy() {
        Enemy mummy = new Mummy("Mummy", 13, 10, 10, 10, 10);
        mummy.calculatedStats();
        return mummy;
    }

    @Bean(name="Scorpion")
    @Scope(value = "prototype")
    public Enemy scorpion() {
        Enemy scorpion = new Scorpion("Scorpion", 15, 10, 10, 10, 10);
        scorpion.calculatedStats();
        return scorpion;
    }

    @Bean(name = "Ghost")
    @Scope(value = "prototype")
    public Enemy ghost() {
        Enemy enemy = new Ghost("Ghost", 25, 10, 10, 14, 10);
        enemy.calculatedStats();
        return enemy;
    }

    @Bean(name = "Ghoul")
    @Scope(value = "prototype")
    public Enemy ghoul() {
        Enemy ghoul = new Ghoul("Ghoul", 20, 12, 14, 12, 12);
        ghoul.calculatedStats();
        return ghoul;
    }

    @Bean(name = "Necromancer")
    @Scope(value = "prototype")
    public Enemy necromancer() {
        Enemy necromancer = new Necromancer("Necromancer", 28, 10, 10, 14, 12);
        necromancer.calculatedStats();
        return necromancer;
    }

    @Bean(name = "Skeleton")
    @Scope(value = "prototype")
    public Enemy skeleton() {
        Enemy skeleton = new Skeleton("Skeleton", 23, 10, 10, 10, 10);
        skeleton.calculatedStats();
        return skeleton;

    }

    @Bean(name = "Dragon")
    @Scope(value = "prototype")
    public Enemy dragon() {
        Enemy dragon = new Dragon("Dragon", 40, 15, 12, 10, 15);
        dragon.calculatedStats();
        return dragon;
    }

    @Bean(name = "FrozenArmor")
    @Scope(value = "prototype")
    public Enemy frozenArmor() {
        Enemy frozenArmor = new FrozenArmor("FrozenArmor", 36, 14, 10, 10, 14);
        frozenArmor.calculatedStats();
        return frozenArmor;
    }

    @Bean(name = "KillerSnowMan")
    @Scope(value = "prototype")
    public Enemy killerSnowMan() {
        Enemy killerSnowMan = new KillerSnowMan("KillerSnowMan", 33, 10, 10, 15, 10);
        killerSnowMan.calculatedStats();
        return killerSnowMan;
    }

    @Bean(name = "Sabletooth")
    @Scope(value = "prototype")
    public Enemy sabletooth() {
        Enemy sabletooth = new Sabletooth("Sabletooth", 31, 12, 14, 10, 12);
        sabletooth.calculatedStats();
        return sabletooth;
    }

    @Bean(name="Bear")
    @Scope(value = "prototype")
    public Enemy bear() {
        Enemy bear = new Bear("Bear", 2, 10, 10, 10, 10);
        bear.calculatedStats();
        return bear;
    }

    @Bean(name = "Wolf")
    @Scope(value = "prototype")
    public Enemy wolf() {
        Enemy wolf = new Wolf("Wolf", 4, 10, 10, 10, 10);
        wolf.calculatedStats();
        return wolf;
    }

    @Bean(name = "Marauder")
    @Scope(value = "prototype")
    public Enemy marauder() {
        Enemy marauder = new Marauder("Marauder", 6, 10, 10, 10, 10);
        marauder.calculatedStats();
        return marauder;
    }

}
