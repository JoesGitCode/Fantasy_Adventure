package player;

import org.junit.Before;
import org.junit.Test;
import player.items.HealingItem;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("St Patrick", 20);
    }


    @Test
    public void canAddHealingItem() {
        cleric.addHealingItem(HealingItem.GREATER_POTION);
        assertEquals(1, cleric.getHealingItems().size());
    }

    @Test
    public void changeEquippedHealing() {
        cleric.addHealingItem(HealingItem.GREATER_POTION);
        cleric.changeEquippedHealing(HealingItem.GREATER_POTION);
        assertEquals(HealingItem.GREATER_POTION, cleric.getEquippedHealing());
    }
}