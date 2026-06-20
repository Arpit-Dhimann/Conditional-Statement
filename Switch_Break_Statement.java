import java.util.Scanner;

public class Switch_Break_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULATOR");
        System.out.print("Enter first numbers: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second numbers: ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation:\n 1 (For Addition),\n 2 (For Subtraction),\n 3 (For Multiplication),\n 4 (For Divide) :\n Enter Choice : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " + (num1 * num2));
                break;
            
            // UPDATED: Added Division Logic.
            // Added a check to avoid runtime errors if num2 is zero.
            // to prevent runtime error/crashes. 
            case 4:
                // Check for division by zero before dividing
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } 
                else {
                    // Logic for handling error
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}