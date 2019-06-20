package player;

import player.weapon.Weapon;

public class Barbarian extends Player implements Melee{

    private Weapon weapon;

    public Barbarian(String name) {
        super(name);
        this.weapon = Weapon.CLUB;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getWeaponDamage() {
        return this.weapon.getDamage();
    }
}
