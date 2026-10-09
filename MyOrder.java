import java.util.Scanner;

public class MyOrder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Food Ordering System");
        System.out.println("1. Pizza - $12");
        System.out.println("2. Sandwich - $8");
        System.out.println("3. Hamburger - $10");

        System.out.print("Enter your choice (1-3): ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            input.close();
            return;
        }

        int nInput = input.nextInt();

        if (nInput < 1 || nInput > 3) {
            System.out.println("Invalid menu option. Please enter a number between 1 and 3.");
            input.close();
            return;
        }

        int nPrice;

        if (nInput == 1) {
            nPrice = 12;
            System.out.println("You choose the pizza. Thank you for your order. Total cost: $" + nPrice);
        } else if (nInput == 2) {
            nPrice = 8;
            System.out.println("You choose the sandwich. Thank you for your order. Total cost: $" + nPrice);
        } else if (nInput == 3) {
            nPrice = 10;
            System.out.println("You choose the hamburger. Thank you for your order. Total cost: $" + nPrice);
        }

        input.close();
    }
}
