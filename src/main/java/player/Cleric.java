package player;

import java.util.ArrayList;

public class Cleric extends Player{

    private  ArrayList<HealingItem> healingItems;



    public Cleric(){
        super(name);
        this.healingItems = new ArrayList<>();

    }

}
