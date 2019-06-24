package player;

import player.spells.Spell;
import player.spells.SpellTarget;

import java.util.ArrayList;

public class Wizard extends Player implements Magic{

    private int maxMana;
    private int currentMana;
    private Spell currentSpell;
    private ArrayList<Spell> spells;

    public Wizard(String name, int health, int maxMana, Spell currentSpell){
        super(name, health);
        this.maxMana = 100;
        this.currentMana = 100;
        this.spells = new ArrayList<Spell>();
        this.currentSpell = new Spell("Spark", 4, 10, SpellTarget.SINGLE);
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public int getMaxMana() {
        return this.maxMana;
    }

    public Spell getSpell(){
        return currentSpell;
    }

    public void learnSpell(Spell spell){
        spells.add(spell);
    }

    public void changeSpell(Spell spell){
        int index = spells.indexOf(spell);
        Spell spellToEquip = this.spells.get(index);
        this.currentSpell = spellToEquip;
    }
}
