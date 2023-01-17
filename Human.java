public class Human extends Being {
    private int hunger;
    private int fatigue;
    private boolean rush;

    public Human(String name, float speed, float weight) {
        super(name, speed, weight);

        this.hunger = 0;
        this.fatigue = 0;
        this.rush = false;
    }

    public int getHunger() {
        return hunger;
    }

    public int getFatigue() {
        return fatigue;
    }

    public boolean isRush() {
        return rush;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }
}
