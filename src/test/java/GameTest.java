import org.junit.Before;
import org.junit.Test;
import player.Barbarian;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canAddCharacter(){
        game.iPlayables.add(new Barbarian("bob", 20));
        assertEquals(1, game.howManyPlayers());
    }
}
