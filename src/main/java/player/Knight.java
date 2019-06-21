package player;

import enemies.Enemy;
import player.weapon.Weapon;

public class Knight extends Player implements Melee{

    private Weapon weapon;
    private int armour;

    public Knight(String name, int health) {
        super(name, health);
        this.weapon = Weapon.LONGSWORD;
        this.armour = 3;
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

    public void attack(Enemy enemy){
        enemy.loseHealth(getWeaponDamage());
    }

    public int getArmour() {
        return this.armour;
    }
}