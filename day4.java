
import java.util.Scanner;
public class day4 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username "); 
        String firstName = input.nextLine();

        System.out.println("Enter password ");
        String passwords = input.nextLine();

        String username = "admin";
        String password= "java123"; 

        if(firstName.equals(username) && passwords.equals(password)){
        System.out.println("login successful");
        }
        else{
        System.out.println("Access denied");  
        }
        input.close();
    }
}
