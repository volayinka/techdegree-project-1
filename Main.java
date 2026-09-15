import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of item should fill the jar?");
        String itemName = scanner.nextLine();

        System.out.println("What is the maximum amount of " + itemName + "?");
        int maxItems = scanner.nextInt();

        Jar jar = new Jar(itemName, maxItems);
        jar.fill();

        System.out.println("How many " + itemName + " are in the jar? Pick a number between 1 and " + maxItems + ".");

        int attempts = 0;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            int guess = scanner.nextInt();
            attempts++;

            if (guess == jar.getCurrentItems()) {
                guessedCorrectly = true;
            } else if (guess > jar.getCurrentItems()) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }
        }

        System.out.println("You got it in " + attempts + " attempt(s).");
    }
}