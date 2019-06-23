package player.weapon;

public enum Weapon {

    LONGSWORD (5),
    WAR_TRIDENT (12),
    GLAIVE (7),
    ZWEIHANDER (10),
    BATTLE_AXE (8),
    CLUB (7),
    MACE(6);

    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
