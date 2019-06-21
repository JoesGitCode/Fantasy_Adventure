package enemies;

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

    public void setHealth(){
        int minHealth = 10;
        int maxHealth = 20;
        int randomHealth = minHealth + (int)(Math.random() * ((maxHealth - minHealth) + 1));
        this.health = randomHealth;
    }

    public void setDamage() {
        int minDamage = 5;
        int maxDamage = 10;
        int randomDamage = minDamage + (int) (Math.random() * ((maxDamage - minDamage) + 1));
        this.damage = randomDamage;
    }

}
