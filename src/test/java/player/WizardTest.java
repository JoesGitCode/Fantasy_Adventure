package player;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Glindorf", 100);
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
