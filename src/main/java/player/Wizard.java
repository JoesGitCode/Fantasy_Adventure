package player;

import player.actions.IHealable;
import player.spells.Spell;
import player.spells.SpellTarget;

import java.util.ArrayList;

public class Wizard extends Player implements Magic, IHealable {

    private int maxMana;
    private int currentMana;
    private Spell currentSpell;
    private ArrayList<Spell> spells;
    private int maxHealth;

    public Wizard(String name, int health, int maxMana, Spell currentSpell){
        super(name, health);
        this.maxHealth = 25;
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

    public void beHealed(int healing) {
        if (this.health + healing <= maxHealth){
            this.health += healing;
        } else if (this.health + healing > maxHealth) {
            this.health = maxHealth;
        }
    }
}
