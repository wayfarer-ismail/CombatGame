import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Environment {
    Tile[][] floor;

    public Environment(int length, int width) {
        floor = new Tile[length][width];
        IntStream.range(0, floor.length).forEach(x -> Arrays.setAll(floor[x], y -> new Tile()));
    }

    @Override
    public String toString() {
        String board = "width: " + floor[0].length + "/ height: " + floor.length + "\n";
        for (int i = 0; i < floor[0].length; i++) {
            board = board.concat("|");
            for (int j = 0; j < floor.length; j++) {
                if (i == 0 || i == floor.length -1) {
                    board = board.concat("-".repeat(6));
                } else {
                    board = board.concat(" ".repeat(6));
                }
            }
            board = board.concat("|\n");
        }

        return board;
    }

}
