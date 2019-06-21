package player;

import player.spells.Spell;

public interface Magic {

    public Spell getSpell();
    public void changeSpell(Spell spell);


}
