package player;

public abstract class Player  {

    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }


    public void loseHealth(int value){
        health -= value;
        if (health <= 0){
            playerDead();
        }
    }

    public String playerDead(){
        return "PLACEHOLDER player Dead.... something happens";
    }
}
