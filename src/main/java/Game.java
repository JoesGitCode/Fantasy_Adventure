import enemies.Boss;
import enemies.NormalEnemy;
import player.Barbarian;
import player.Player;
import rooms.Room;

public class Game {



    public Game(){

        gameStart();
    }

    public void gameStart(){
        System.out.println("Game starting");
        // player selects a character/weapon somehow. text input with big if statement for multiple choices?
        // multiple players added to party array?
        // player selects a direction (this wont matter)
        // generate room
        // logic to determine which type of room. increased chance for normalenemy etc
        // add this to room
        // player chooses to attack or run perhaps?

        // for each enemy in room, its attacks a player. more players? random attack
        // keep attacking until someone dies
        // reward?
        // select direction and start again


        // game ends if player(s) die or..
        // array of bosses? when defeated, delete from array. empty array = game win
    }

    public void createCharacter(){
        // scanner do you want healer, melee, magic

    }





}