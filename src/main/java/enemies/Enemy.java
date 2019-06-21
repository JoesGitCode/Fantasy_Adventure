package enemies;

import player.Player;

public abstract class Enemy {

    private String name;
    public int health;
    public int damage;

    public Enemy(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void attack(Player player){
        player.loseHealth(damage);
    }

    public void loseHealth(int value){
        health -= value;
        if (health <= 0){
            enemyDead();
        }
    }

    public String enemyDead(){
        return "PLACEHOLDER Enemy Dead.... something happens";
    }

    public void setRandomHealth(){
        int minHealth = 10;
        int maxHealth = 20;
        int randomHealth = minHealth + (int)(Math.random() * ((maxHealth - minHealth) + 1));
        this.health = randomHealth;
    }

    public void setRandomDamage() {
        int minDamage = 5;
        int maxDamage = 10;
        int randomDamage = minDamage + (int) (Math.random() * ((maxDamage - minDamage) + 1));
        this.damage = randomDamage;
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

        this.name = firstName + secondName + lastName;
    }


}
