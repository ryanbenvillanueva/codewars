import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                } else if (first + amount <= 100) {
                    first += amount;
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                } else if (first + amount > 100) {
                    first = 100;
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                }
            }

            if (command.equals("move")) {
                if (amount <= 0) {
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                } else if (first - amount >= 0) {
                    first -= amount;
                    if (second + amount >= 100) {
                        second = 100;
                    } else {
                        second += amount;
                    }
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                } else if (first - amount < 0) {
                    if (first > 0) {
                        second += amount - first;
                    }

                    first = 0;
                    System.out.println("");
                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");
                }
            }
        }
    }
}
