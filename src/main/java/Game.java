import enemies.Boss;
import enemies.Enemy;
import enemies.NormalEnemy;
import player.Barbarian;
import player.Player;
import rooms.Room;

public class Game {

    private Player player;
    private Barbarian barbarian;
    private Room room;
    private NormalEnemy normalEnemy;
    private Boss boss;

    public Game(Player player, Room room, NormalEnemy normalEnemy){
        this.player = player;
        this.room = room;
        this.normalEnemy = normalEnemy;
        gameStart();
    }

    public void gameStart(){
        System.out.println("Game starting");
        normalEnemy.attack(barbarian);
    }
}
