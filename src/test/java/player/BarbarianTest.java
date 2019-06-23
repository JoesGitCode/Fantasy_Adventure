package player;

import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.weapon.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Grub Grub", 30);
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
}
