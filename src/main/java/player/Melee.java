package player;

import player.weapon.Weapon;

public interface Melee{


    Weapon getWeapon();

    void changeWeapon(Weapon weapon);

    int getWeaponDamage();



}
