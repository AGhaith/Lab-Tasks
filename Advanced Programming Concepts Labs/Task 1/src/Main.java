
// // Advanced Programming Concepts Lab 2 Task 1 Main
// Import Scanner To Read Input
import java.util.Scanner;

// Create Main Class
public class Main {
    // Main Function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Initializations
        // Taking Inputs For Calculation
        System.out.println("Enter Two Numbers: ");
        int FirstInput = input.nextInt(), SecondInput = input.nextInt();
        // Implementing Calculations
        int Addition = FirstInput + SecondInput;
        int Subtraction = FirstInput - SecondInput;
        int Multiplication = FirstInput * SecondInput;
        // Outputting Calculations
        System.out.println("Sum = " + Addition);
        System.out.println("Difference = " + Subtraction);
        System.out.println("Product = " + Multiplication);
        // Closing Scanner
        input.close();
    }
}
// Ahmed Ghaith