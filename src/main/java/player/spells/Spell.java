package player.spells;

public class Spell {

    private SpellTarget targets;
    private int manaCost;
    private String name;
    private int damage;


    public Spell(String name, int damage, int manaCost, SpellTarget targets){
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
        this.targets = targets;
    }
}
