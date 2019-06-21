package enemies;

public class Boss extends Enemy {

    public Boss(String name, int health, int damage){
        super(name, health, damage);

    }

    public void setBossHealth(){
        setRandomHealth();
        health += 20;
    }

    public void setBossDamage(){
        setRandomDamage();
        damage += 10;
    }


}
