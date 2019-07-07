package room;

import enemies.NormalEnemy;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.Player;
import rooms.Room;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room;
    NormalEnemy normalEnemy;
    Player player;

    @Before
    public void before(){
        room = new Room();
        player = new Barbarian("test", 40);
        normalEnemy = new NormalEnemy("Joanna Lumley", 10, 5);
    }

    @Test
    public void aRoomStartsEmpty(){
        assertEquals(0, room.numberOfContents());
    }

    @Test
    public void aRoomCanContainAnEnemy(){
        room.addContent(normalEnemy);
        assertEquals(1, room.numberOfContents());
    }

    @Test
    public void aRoomCanBeCleared(){
        room.addContent(normalEnemy);
        room.clearRoom();
        assertEquals(0, room.numberOfContents());
    }

//    @Test
//    public void canAttackAllWithAllEnemies(){
//        room.addContent(normalEnemy);
//        room.addContent(normalEnemy);
//        room.enemyTurn(player);
//        assertEquals();
//    }


}
