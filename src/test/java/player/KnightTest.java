package player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Sir Berreck");
    }

    @Test
    public void canGetKightName(){
        assertEquals("Sir Berreck", knight.getName());
    }

    @Test
    public void hasArmour(){
        assertEquals(3 ,knight.getArmour());
    }

}