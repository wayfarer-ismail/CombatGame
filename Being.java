import java.util.ArrayList;
import java.util.Collection;

//parent class for playable characters
public class Being {
    private final String name;
    private float health;
    private float speed;
    private float weight;
    private final Collection<Usable> inventory; //objets that the player will use

    //Constructor
    public Being (String name, float speed, float weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;

        this.health = 100;
        this.inventory = new ArrayList<>(10);
    }

    //accessors
    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }

    public float getSpeed() {
        return speed;
    }

    public float getWeight() {
        return weight;
    }

    public Collection<Usable> getInventory() {
        return inventory;
    }

    //mutators
    public void addHealth(float points) {
        this.health += points;
        if (this.health > 100) {
            this.health = 100;
        }
    }

    public void loseHealth(float points) {
        this.health -= points;
        if (this.health < 0) {
            this.health = 0;
        }
    }

    public void changeSpeed(float speed) {
        this.speed += speed;

        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    public void changeWeight(float weight) {
        this.weight += weight;

        if (this.weight < 0) {
            this.weight = 0;
        }
    }
}
