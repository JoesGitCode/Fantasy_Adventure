import enemies.Boss;
import enemies.Enemy;
import enemies.NormalEnemy;
import player.*;
import player.spells.Spell;
import player.spells.SpellTarget;
import rooms.IRoomable;
import rooms.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    ArrayList<IPlayable> iPlayables;
    ArrayList<IRoomable> roomContents;

    Room room;

    public Game(){
        this.iPlayables = new ArrayList<IPlayable>();
        this.roomContents = new ArrayList<IRoomable>();
        gameStart();
    }

    public void gameStart(){
        createCharacter();
        directionChoice();
        generateRandomRoom();
        System.out.println(roomContents);
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

//    public ArrayList<IPlayable> getAllCharacters(){
//        return iPlayables;
//    }
//
//    public ArrayList<IPlayable> getAllPlayable() {
//        ArrayList<IPlayable> result = new ArrayList<IPlayable>();
//        for ( IPlayable playable : iPlayables) {
//                result.add(playable);
//            }
//        }
//        return result;
//    }



    public void createCharacter(){
        System.out.println("Hello there, what is your name");
        Scanner nameInput = new Scanner(System.in);
        String characterName = nameInput.nextLine();
        System.out.println("Which character do you want to play as? Choose from: barbarian, knight or wizard");
        Scanner characterInput = new Scanner(System.in);
        String characterChoice = characterInput.nextLine();
        if (characterChoice.contentEquals("barbarian")) {
            iPlayables.add(new Barbarian(characterName, 20));
        } else if (characterChoice.startsWith("knight")) {
            iPlayables.add(new Knight(characterName, 20));
        } else if (characterChoice.contentEquals("wizard")) {
            Spell currentSpell = new Spell("Spark", 4, 10, SpellTarget.SINGLE);
            iPlayables.add(new Wizard(characterName, 20, 100, currentSpell ));
        }
        System.out.println("A " + characterChoice + " called " + characterName + " eh? Interesting choice...");
    }

    public void chooseBarbarian(){
        iPlayables.add(new Barbarian("bob", 20));
    }

    public int howManyPlayers(){
       return iPlayables.size();
    }

    public void directionChoice(){
        System.out.println("Which direction would you like to travel? north, south, east, west");
        Scanner direction = new Scanner(System.in);
        String chosenDirection = direction.nextLine();
        String decisionComments[] = {"I wouldn't choose " + chosenDirection + " but ok... ", "Really.." + chosenDirection + " ? Terrible decision ", "I'd never go " + chosenDirection + " but it's your choice ", "You know what's in there?! Oh well, go " + chosenDirection + " if you want..."};
        int randomIndexComment = (int) (Math.random() * decisionComments.length);
        String comment = decisionComments[randomIndexComment];
        System.out.println(comment);


    }

    public void generateRandomRoom(){
        roomContents.add(room.generateNormalEnemy());
    }

//    public void enemyTurn(){
//        for (IPlayable player : iPlayables){
//            room.enemyTurn(player);
//
//        }
//    }





}