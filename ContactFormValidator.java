//You are tasked with building a basic contact form checker for a local shop’s website. The form collects a person’s name, email, and phone number. Your task is to write a Java program that validates the following:

//Accept user input for name, email, and phone number using Scanner.
//Validate the name to ensure it starts with a capital letter and contains only letters or spaces.
//Validate the email to ensure it contains both " @ "and " ." and does not start or end with these symbols.
//Validate the phone number to ensure it contains exactly 10 digits.
//Print a clear message for each field indicating whether it is valid or not.

import java.util.Scanner;
public class ContactFormValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        // Validate Name
        // Starts with a capital letter + only letters or spaces
        if (name.matches("[A-Z][a-zA-Z ]*")) {
            System.out.println("Name is VALID");
        } else {
            System.out.println("Name is INVALID (Must start with capital letter and contain only letters/spaces)");
        }

        // Validate Email
        // Contains @ and . but not starting/ending with them
        if (email.contains("@") && email.contains(".") &&
            !email.startsWith("@") && !email.startsWith(".") &&
            !email.endsWith("@") && !email.endsWith(".")) {
            System.out.println("Email is VALID");
        } else {
            System.out.println("Email is INVALID");
        }

        // Validate Phone Number
        // Exactly 10 digits
        if (phone.matches("\\d{10}")) {
            System.out.println("Phone Number is VALID");
        } else {
            System.out.println("Phone Number is INVALID (Must contain exactly 10 digits)");
        }

        sc.close();
    }
}
