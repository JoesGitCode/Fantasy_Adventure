import enemies.Enemy;
import enemies.NormalEnemy;
import player.Barbarian;
import player.Player;
import rooms.Room;

public class Runner {


    public static void main(String[] args) {

        Player player = new Barbarian("Bob", 30);
        Room room = new Room();
        NormalEnemy normalEnemy = new NormalEnemy("m", 10, 10);

        Game game = new Game(player, room, normalEnemy);
    }
}