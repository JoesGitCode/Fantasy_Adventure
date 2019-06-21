package enemies;

public class NormalEnemy extends Enemy {


    public NormalEnemy(String name, int health, int damage){
        super(name, health, damage);
    }


    public void generateRandomNormalEnemy(){
        setRandomName();
        setRandomDamage();
        setRandomHealth();
    }

}
