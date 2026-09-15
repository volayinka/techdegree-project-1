import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of item should fill the jar?");
        String itemName = scanner.nextLine();

        System.out.println("What is the maximum amount of " + itemName + "?");
        int maxItems = scanner.nextInt();

        Jar jar = new Jar(itemName, maxItems);
    }
}