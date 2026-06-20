import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Logic: If age is 18 or older, the user is eligible
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } 
        // Otherwise, the user is a minor
        else {
            System.out.println("You are not eligible to vote.");
        }

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}