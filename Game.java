import java.util.Scanner;

public class Game {
    private Environment environment;
    private final Scanner in = new Scanner(System.in);
    private Being player1;
    private Being player2;

    public void start () {
        environment = new Environment(6,6);

        System.out.println("Player 1");
        player1 = createPlayer();

        System.out.println("\nPlayer 2");
        player2 = createPlayer();

        play();

        end();
    }

    public Being getPlayer1() {
        return player1;
    }

    public Being getPlayer2() {
        return player2;
    }

    private void play () {
        System.out.println(environment);
//        Scanner in = new Scanner(System.in);
//
//        while (!this.isFinished()) {
//            String move = in.next();
//
//            switch (move) {
//                case "w" -> ;
//            }
//            System.out.println("make a move"); //using wasd
//
//        }

    }

    private Being createPlayer() {
        Being player = new Being("", 0, 0);

        System.out.print("what type of character would you like? Enter 1 or 2. \n1. Human \n2. Alien \n:");

        String choice = in.next();

        while (!choice.matches("[12]")) {
            System.out.println("try again, 1 for human or 2 for Alien: ");
            choice = in.next();
        }

        System.out.println("Enter the name of your character: ");
        String name = in.next();

        if (choice.matches("1")) {
            player = new Human(name, 50, 50);
        } else if (choice.matches("2")) {
            player = new Alien(name, 50, 50);
        }

        return player;
    }

    private boolean isFinished() {
        return getPlayer1().getHealth() > 0 || getPlayer2().getHealth() > 0;
    }

    private void end() {
        in.close();
    }
}
