package enemies;

import player.IPlayable;
import player.Player;
import rooms.IRoomable;

public class Boss extends Enemy implements IRoomable {

    public Boss(String name, int health, int damage){
        super(name, health, damage);

    }

    public void attack(IPlayable player){
        player.loseHealth(damage);
    }


    public void setBossHealth(){
        setRandomHealth();
        health += 20;
    }

    public void setBossDamage(){
        setRandomDamage();
        damage += 10;
    }

    public void attack(Player player){
        player.loseHealth(damage);
    }


    public void setRandomName(){
        String namesAdjectives[] = {"Ancient ", "Armored ", "Bearded ", "Handsome ", "Giant ", "Zombie ", "Racist ", "Eight-Legged"};
        String nameColours[] = {"Red ", "Fire ", "Blue ", "Ice ", "Green ", "Golden ", "White ", "Black "};
        String nameTypes[] = {"Goblin", "Ogre", "Witch", "Dragon", "Pokemon", "Sandwich"};

        int randomIndexAdjective = (int) (Math.random() * namesAdjectives.length);
        int randomIndexColour = (int) (Math.random() * nameColours.length);
        int randomIndexType = (int) (Math.random() * nameTypes.length);

        String firstName = namesAdjectives[randomIndexAdjective];
        String secondName = nameColours[randomIndexColour];
        String lastName = nameTypes[randomIndexType];

        name = firstName + secondName + lastName;
    }


}
