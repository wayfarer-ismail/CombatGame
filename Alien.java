public class Alien extends Being{
    private int sleep; //a listener will detect changes in this value and react accordingly

    public Alien(String name, float speed, float weight) {
        super(name, speed, weight);

        this.sleep = 0;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }
}
