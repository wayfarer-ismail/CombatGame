public class Tile {
    int damage;
    int health;

    //TODO: add a field that holds the character on this tile.

    public Tile() {
        damage = 0;
        health = 0;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return """
                 -----
                /     \\
                |     |
                |     |
                \\     /
                 -----
                """;
    }
}
