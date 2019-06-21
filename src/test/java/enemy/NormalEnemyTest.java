package enemy;

import org.junit.Before;
import enemies.NormalEnemy;
import org.junit.Test;

import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertEquals;

public class NormalEnemyTest {

    NormalEnemy normalEnemy;

    @Before
    public void before(){
        normalEnemy = new NormalEnemy("Sebulba", 20, 20);
    }

    @Test
    public void aNormalEnemyHasAName(){
        assertEquals("Sebulba", normalEnemy.getName());
    }

    @Test
    public void aNormalEnemyHasRandomHealthBetween10and20(){
        normalEnemy.setHealth();
        System.out.println("NormalEnemy health: " + normalEnemy.getHealth());
        assertNotSame( 9, normalEnemy.getHealth());
    }

    @Test
    public void aNormalEnemyHasDamageBetween5and10(){
        normalEnemy.setDamage();
        System.out.println("NormalEnemy damage: " + normalEnemy.getDamage());
        assertNotSame(14, normalEnemy.getDamage());
    }



}