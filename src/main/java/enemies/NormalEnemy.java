package enemies;

import player.Player;
import rooms.IRoomable;

public class NormalEnemy extends Enemy implements IRoomable {


    public NormalEnemy(String name, int health, int damage){
        super(name, health, damage);
    }

    public void attack(Player player){
        player.loseHealth(damage);
    }


    public void setRandomName(){
        String namesAdjectives[] = {"Ancient ", "Armored ", "Bearded ", "Handsome ", "Giant ", "Zombie ", "Eight-Legged "};
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

    public void generateRandomNormalEnemy(){
        setRandomName();
        setRandomDamage();
        setRandomHealth();
    }

}
