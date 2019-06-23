package enemy;

import org.junit.Before;
import enemies.Boss;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertEquals;

public class BossTest {

    Boss boss;

    @Before
    public void before(){
        boss = new Boss("Eamonn Holmes", 20, 20);
    }

    @Test
    public void aBossHasAName(){
        assertEquals("Eamonn Holmes", boss.getName());
    }

    @Test
    public void aBossHasRandomHealthBetween30and40(){
        boss.setBossHealth();
        System.out.println("Boss health: " + boss.getHealth());
        assertNotSame( 9, boss.getHealth());
    }

    @Test
    public void aBossHasDamageBetween15and20(){
        boss.setBossDamage();
        System.out.println("Boss damage: " + boss.getDamage());
        assertNotSame(14, boss.getDamage());
    }



}
