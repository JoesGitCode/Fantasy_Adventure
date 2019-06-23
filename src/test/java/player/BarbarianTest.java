package player;

import enemies.NormalEnemy;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.weapon.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    NormalEnemy normalEnemy;

    @Before
    public void before(){
        barbarian = new Barbarian("Grub Grub", 20);
        normalEnemy = new NormalEnemy("enemy", 15, 10);
    }


    @Test
    public void canGetWeapon() {
        assertEquals(Weapon.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.changeWeapon(Weapon.WAR_TRIDENT);
        assertEquals(Weapon.WAR_TRIDENT, barbarian.getWeapon());
    }

    @Test
    public void weaponHasDamage(){
        assertEquals(7, barbarian.getWeaponDamage());
    }

    @Test
    public void canTakeDamageFromEnemy(){
        normalEnemy.attack(barbarian);
        assertEquals(10, barbarian.getHealth());
    }

    @Test
    public void canGiveDamageToEnemy(){
        barbarian.attack(normalEnemy);
        assertEquals(8, normalEnemy.getHealth());
    }

}
