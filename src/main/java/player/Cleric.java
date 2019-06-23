package player;

import player.items.HealingItem;

import java.util.ArrayList;

public class Cleric extends Player{

    private  ArrayList<HealingItem> healingItems;



    public Cleric(String name){
        super(name);
        this.healingItems = new ArrayList<HealingItem>();

    }

}
