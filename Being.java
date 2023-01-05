public class Being {
    private final String name;
    private float health;

    public Being (String name) {
        this.name = name;

        this.health = 100;
    }


    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }

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
}
