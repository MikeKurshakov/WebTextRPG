import com.art.character.Heroes.Mage;
import com.art.character.Heroes.Player;
import com.art.character.Heroes.Rogue;
import com.art.character.Heroes.Warrior;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    @Test
    public  void mageTest() {
        Player mage = new Mage("Mage");
        assertEquals("Mage",mage.getName());
        assertEquals(60,mage.getAttack());
    }
    @Test
    public  void rogueTest() {
        Player rogue = new Rogue("Rogue");
        assertEquals("Rogue",rogue.getName());
        assertEquals(130,rogue.getAttack());
    }
    @Test
    public  void warriorTest() {
        Player warrior = new Warrior("Warrior");
        assertEquals("Warrior",warrior.getName());
        assertEquals(165,warrior.getAttack());
    }


}
