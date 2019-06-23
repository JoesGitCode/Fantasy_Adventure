package room;

import enemies.NormalEnemy;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {

    Room room;
    NormalEnemy normalEnemy;

    @Before
    public void before(){
        room = new Room();
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


}
