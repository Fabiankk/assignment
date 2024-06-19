/**
 * java assignment
 */
import java.util.Scanner;
public class surname{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user to enter surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        // Ask user to enter current age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();
        
        // Calculate number of characters in the surname
        int numCharacters = surname.length();
        
        // Determine if age is even or odd
        String ageType = (age % 2 == 0) ? "even" : "odd";
        
        // Output results
        System.out.println("The number of characters in your surname is " + numCharacters + ".");
        System.out.println("Your current age is an " + ageType + " number.");
        
        scanner.close();
    }

 }

    


