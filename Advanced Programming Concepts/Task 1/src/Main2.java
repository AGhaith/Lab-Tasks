
// Advanced Programming Concepts Task 2 Main //
// Import Scanner To Read Input
import java.util.Scanner;

// Main Class
public class Main2 {
    // Main Function
    public static void main(String[] args) {

        // Import Scanner To Read Input
        Scanner input = new Scanner(System.in);
        // Creating Object Of Rectangle_Class
        Rectangle_Class Rectangle = new Rectangle_Class();
        // Taking Inputs For Rectangle Length And Width
        System.out.println("Enter Length And Width Of Rectangle: ");
        float length = input.nextFloat(), width = input.nextFloat();
        // Setting Rectangle Length And Width
        Rectangle.Set_Length(length);
        Rectangle.Set_Width(width);
        // Outputting Rectangle Area And Perimeter
        System.out.println("Area = " + Rectangle.Get_Area() + "Perimeter = " + Rectangle.Get_Perimeter());
        // Closing Scanner
        input.close();
    }

}
// Ahmed Ghaith
