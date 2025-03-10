// Circle class with radius and color attributes, and two constructors
// Circle class
public class Circle {
    // Radius of the circle
    private double radius;
    // Color of the circle
    private String color;

    // Default constructor
    public Circle() {
        radius = 1;
        color = "red";
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
        color = "not red";
    }

    // Get radius of the circle
    public double Get_Radius() {
        return radius;
    }

    // Get area of the circle
    public double Get_Area() {
        return 3.14 * radius * radius;
    }
}
