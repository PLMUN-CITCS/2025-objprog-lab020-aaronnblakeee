import java.util.Scanner;

public class Main {

    // Method to display the menu options to the user
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check if number is Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();  // Call method to greet the user
                break;
            case 2:
                checkEvenOrOdd();  // Call method to check if the number is even or odd
                break;
            case 3:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);  // Exit the program
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome to the program!");
    }

    // Method to check if the entered number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();  // Consume the invalid input
        }
        int number = scanner.nextInt();  // Get the user's input
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to continuously display the menu and handle user choices
        while (true) {
            displayMenu();  // Display the menu
            int choice = scanner.nextInt();  // Get the user's choice
            handleMenuChoice(choice);  // Process the choice
        }
    }
}
