

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined correct name and password
        String correctName = "Hassan";
        String correctPassword = "12345";

        // Asking for name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        // Asking for password
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Checking the name
        if (name.equals(correctName)) {
            System.out.println("Name is correct");
        } else {
            System.out.println("Name is incorrect");
        }

        // Checking the password
        if (password.equals(correctPassword)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Password is incorrect");
        }
        
        scanner.close(); // Closing the scanner object
    }
}

