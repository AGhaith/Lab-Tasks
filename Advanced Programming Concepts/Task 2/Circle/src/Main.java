// Main class
public class Main {
    // Main function
    public static void main(String[] args) {
        // Creating Cricle object with default constructor
        Circle Circle1 = new Circle();
        // Creating Cricle object with parameterized constructor
        Circle Circle2 = new Circle(5.5);
        // Printing the radius and area of Circle1 and Circle2
        System.out.println(Circle1.Get_Radius());
        System.out.println(Circle1.Get_Area());
        System.out.println(Circle2.Get_Radius());
        System.out.println(Circle2.Get_Area());
    }
}
