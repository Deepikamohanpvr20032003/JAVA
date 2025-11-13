// Package declaration (user-defined)
package registration;

// Import Scanner class for taking user input
import java.util.Scanner;
public class WelcomeForm {

    public static void main(String[] args) {
        
        // Create Scanner object to read input from user
        Scanner input = new Scanner(System.in);
        
        // Ask for user's first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine(); // Read string input
        
        // Ask for user's age
        System.out.print("Enter your age: ");
        int age = input.nextInt(); // Read integer input
        
        // Display a welcome message
        System.out.println(" Registration Successful!");
        System.out.println("Welcome, " + firstName + "!");
        System.out.println("Your age is: " + age);
        System.out.println("Thank you for registering with us.");
        
        // Close the scanner
        input.close();
    }
}