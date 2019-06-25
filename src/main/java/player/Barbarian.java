package player;

import enemies.Enemy;
import player.weapon.Weapon;

public class Barbarian extends Player implements Melee, IPlayable{

    private Weapon weapon;

    public Barbarian(String name, int health) {
        super(name, health);
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

    public void attack(Enemy enemy){
        enemy.loseHealth(getWeaponDamage());
    }
}
