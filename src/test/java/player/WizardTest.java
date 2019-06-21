package player;

import org.junit.Before;
import org.junit.Test;
import player.spells.Spell;
import player.spells.SpellTarget;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell currentSpell;

    @Before
    public void before(){
        currentSpell = new Spell("Spark", 4, 10, SpellTarget.SINGLE);

        wizard = new Wizard("Glindorf", 100, currentSpell);
    }

    @Test
    public void canGetWizardName(){
        assertEquals("Glindorf", wizard.getName());
    }

    @Test
    public void getCurrentMana() {
        assertEquals(100, wizard.getCurrentMana());
    }

    @Test
    public void canGetMaxMana() {
        assertEquals(100, wizard.getMaxMana());

    }
}
