import java.util.Scanner; // Import Scanner to read user input

public class Else_If_Statement {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Checking the first condition
        if (marks >= 90) {
            System.out.println("Grade: A");
        } 
        // If marks are less than 90, it moves to this condition
        else if (marks >= 70) {
            System.out.println("Grade: B");
        } 
        // If marks are also less than 70, it checks this
        else if (marks >= 50) {
            System.out.println("Grade: C");
        } 
        // If none of the above conditions are true, it executes this block
        else {
            System.out.println("Result: Fail");
        }

        // Close the scanner to free up system resources
        sc.close();
    }
}