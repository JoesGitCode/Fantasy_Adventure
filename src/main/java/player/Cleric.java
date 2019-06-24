package player;

import player.items.HealingItem;

import java.util.ArrayList;

public class Cleric extends Player{

    private HealingItem equippedHealingItem;
    private ArrayList<HealingItem> healingItems;



    public Cleric(String name, int health){
        super(name, health);
        this.healingItems = new ArrayList<HealingItem>();
        this.equippedHealingItem = HealingItem.HERB;
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
}
