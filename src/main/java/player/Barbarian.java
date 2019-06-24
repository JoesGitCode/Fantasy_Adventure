package player;

import player.actions.IHealable;
import player.items.Weapon;
import enemies.Enemy;

public class Barbarian extends Player implements Melee, IHealable {

    private Weapon weapon;
    private int maxHealth;

    public Barbarian(String name, int health) {
        super(name, health);
        this.weapon = Weapon.CLUB;
        this.maxHealth = 30;
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

    public void beHealed(int healing) {
        if (this.health + healing <= maxHealth){
            this.health += healing;
        } else if (this.health + healing > maxHealth) {
            this.health = maxHealth;
        }
    }
}
