package player;

import player.items.Weapon;

public interface Melee{


    Weapon getWeapon();

    void changeWeapon(Weapon weapon);

    int getWeaponDamage();

}
