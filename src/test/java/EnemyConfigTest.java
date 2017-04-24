import com.art.character.Enemies.Enemy;
import com.art.init.EnemyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertNotNull;

@ContextConfiguration(
        classes = EnemyConfig.class)
public class EnemyConfigTest {
    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EnemyConfig.class);
    @Test
    public void woodlandEnemyTest(){
        Enemy enemy = (Enemy) applicationContext.getBean("Bear");
        Object wolf = applicationContext.getBean("Wolf");
        Object marauder = applicationContext.getBean("Marauder");
        assertNotNull(enemy);
        assertNotNull(wolf);
        assertNotNull(marauder);
    }

    @Test
    public  void barrensEnemyTest() {
        Object cultist = applicationContext.getBean("Cultist");
        Object demon = applicationContext.getBean("Demon");
        Object mummy = applicationContext.getBean("Mummy");
        Object scorpion = applicationContext.getBean("Scorpion");
        assertNotNull(cultist);
        assertNotNull(demon);
        assertNotNull(mummy);
        assertNotNull(scorpion);
    }
    @Test
    public void boneyardTest() {
        Object chost = applicationContext.getBean("Ghost");
        Object ghoul = applicationContext.getBean("Ghoul");
        Object necromancer = applicationContext.getBean("Necromancer");
        Object skeleton = applicationContext.getBean("Skeleton");
        assertNotNull(chost);
        assertNotNull(ghoul);
        assertNotNull(necromancer);
        assertNotNull(skeleton);
    }
    @Test
    public void frozenHills() {
        Object dragon = applicationContext.getBean("Dragon");
        Object frozenArmor = applicationContext.getBean("FrozenArmor");
        Object killerSnowMan = applicationContext.getBean("KillerSnowMan");
        Object sabletooth = applicationContext.getBean("Sabletooth");
        assertNotNull(dragon);
        assertNotNull(frozenArmor);
        assertNotNull(killerSnowMan);
        assertNotNull(sabletooth);

    }
}
