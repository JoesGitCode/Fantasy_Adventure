package player.items;

public enum HealingItem {
    POTION (10),
    HERB (5),
    GREATER_POTION (15),
    ;

    private final int healing;

    HealingItem(int healing) {
        this.healing = healing;
    }

    public int getHealing(){
        return this.healing;
    }
}
