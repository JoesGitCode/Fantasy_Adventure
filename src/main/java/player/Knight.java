package player;

import player.actions.IHealable;
import player.items.Weapon;
import enemies.Enemy;


public class Knight extends Player implements Melee, IHealable {

    private Weapon weapon;
    private int armour;
    private int maxHealth;

    public Knight(String name, int health) {
        super(name, health);
        this.maxHealth = 30;
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

    public void beHealed(int healing) {
        if (this.health + healing <= maxHealth){
            this.health += healing;
        } else if (this.health + healing > maxHealth) {
            this.health = maxHealth;
        }
    }
}