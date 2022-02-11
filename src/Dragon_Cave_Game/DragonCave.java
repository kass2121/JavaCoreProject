package Dragon_Cave_Game;
import java.util.Random;
import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        displayIntro();
        chooseCave();
    }

    public static void displayIntro() {
        System.out.println("You are in a land full of dragons." + " In front of you,you see two caves."
                + " In one cave, the dragon is friendly and will share his treasure with you."
                + " The other dragons greedy and hungry, and will eat you on sight.");
    }

    public static void chooseCave() {
        Scanner scanner = new Scanner(System.in);
        int cave = 0;
        //
        while (cave != 1 && cave != 2) {
            System.out.println("Which cave will you go into? (1 or 2)");
            cave = scanner.nextInt();
        }
        System.out.println("You approach the cave...");

        System.out.println("It is dark and spooky...");

        System.out.println("A large dragon jumps out in front of you!  He opens his jaws and...");

        Random rand = new Random();
        int friendlyCave = rand.nextInt(2) + 1;

        if (cave == friendlyCave) {
            System.out.println("Gives you his treasure!");
        } else {
            System.out.println("Gobbles you down in one bite!");
        }
        System.out.println("Do you want to play again? (yes or no)");
        String str = scanner.nextLine();
        if (str.equalsIgnoreCase("yes")) {

            displayIntro();
            chooseCave();
        }

    }
}
