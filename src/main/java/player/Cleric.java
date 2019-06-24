package player;

import player.actions.IHealable;
import player.items.HealingItem;

import java.util.ArrayList;

public class Cleric extends Player implements IHealable {

    private HealingItem equippedHealingItem;
    private ArrayList<HealingItem> healingItems;
    private int maxHealth;
    private ArrayList<IHealable> allys;


    public Cleric(String name, int health){
        super(name, health);
        this.maxHealth = 30;
        this.healingItems = new ArrayList<HealingItem>();
        this.equippedHealingItem = HealingItem.HERB;
        this.allys = new ArrayList<IHealable>();
    }

    public ArrayList<HealingItem> getHealingItems() {
        return healingItems;
    }

    public void addHealingItem(HealingItem healingItem){
        healingItems.add(healingItem);
    }

    public void changeEquippedHealing(HealingItem healingItem){
        int index = healingItems.indexOf(healingItem);
        HealingItem healingItemToEquip = this.healingItems.get(index);
        this.equippedHealingItem = healingItemToEquip;
    }

    public HealingItem getEquippedHealing() {
        return this.equippedHealingItem;
    }

    public void heal(IHealable targetToHeal){
        targetToHeal.beHealed(equippedHealingItem.getHealing());
//        need to remove healing item when used
    }

    public void beHealed(int healing) {
        if (this.health + healing <= maxHealth){
            this.health += healing;
        } else if (this.health + healing > maxHealth) {
            this.health = maxHealth;
        }
    }
}
