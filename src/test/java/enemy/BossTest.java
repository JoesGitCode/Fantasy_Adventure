package enemy;

import org.junit.Before;
import enemies.Boss;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BossTest {

    Boss boss;

    @Before
    public void before(){
        boss = new Boss("Eamonn Holmes", 50, 20);
    }

    @Test
    public void aBossHasAName(){
        assertEquals("Eamonn Holmes", boss.getName());
    }

    @Test
    public void aBossHasHealth(){
        assertEquals(50, boss.getHealth());
    }

    @Test
    public void aBossHasDamage(){
        assertEquals(20, boss.getDamage());
    }



}
