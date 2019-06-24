package rooms;

import enemies.NormalEnemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<IRoomable> roomContents;

    public Room(){
        this.roomContents = new ArrayList<IRoomable>();
    }

    public int numberOfContents(){
       return roomContents.size();
    }

    public void addContent(IRoomable content){
        roomContents.add(content);
    }

    public void clearRoom() {
        roomContents.clear();
    }

    public NormalEnemy generateNormalEnemy(){
        String name = generateNormalEnemyName();
        int health = generateRandomHealth();
        int damage = generateRandomDamage();
        NormalEnemy enemy = new NormalEnemy(name, health, damage);
        return enemy;
    }

    public String generateNormalEnemyName(){
        String namesAdjectives[] = {"Ancient ", "Armored ", "Bearded ", "Handsome ", "Giant ", "Zombie ", "Eight-Legged "};
        String nameColours[] = {"Red ", "Fire ", "Blue ", "Ice ", "Green ", "Golden ", "White ", "Black "};
        String nameTypes[] = {"Goblin", "Ogre", "Witch", "Dragon", "Pokemon", "Sandwich"};

        int randomIndexAdjective = (int) (Math.random() * namesAdjectives.length);
        int randomIndexColour = (int) (Math.random() * nameColours.length);
        int randomIndexType = (int) (Math.random() * nameTypes.length);

        String firstName = namesAdjectives[randomIndexAdjective];
        String secondName = nameColours[randomIndexColour];
        String lastName = nameTypes[randomIndexType];

        String name = firstName + secondName + lastName;

        return name;
    }

    public int generateRandomHealth(){
        int minHealth = 10;
        int maxHealth = 20;
        int randomHealth = minHealth + (int)(Math.random() * ((maxHealth - minHealth) + 1));
        int health = randomHealth;
        return health;
    }

    public int generateRandomDamage() {
        int minDamage = 5;
        int maxDamage = 10;
        int randomDamage = minDamage + (int) (Math.random() * ((maxDamage - minDamage) + 1));
        int damage = randomDamage;
        return damage;
    }
    
}
