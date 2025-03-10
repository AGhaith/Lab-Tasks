// Advanced Programming Concepts Lab 2 Task 2 //
//Rectangle Class
public class Rectangle_Class {
    public float length, width;

    // Default Constructor
    Rectangle_Class() {
        length = 0;
        width = 0;
    }

    // Parameterized Constructor
    Rectangle_Class(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // Setters And Getters
    // Length Setter
    void Set_Length(float len) {
        if (len > 0) {
            length = len;
        }
    }

    // Length Getter
    float Get_Length() {
        return length;
    }

    // Width Setter
    void Set_Width(float wid) {

        if (wid > 0) {
            width = wid;
        }
    }

    // Width Getter
    float Get_Width() {
        return width;
    }

    // Area Getter
    float Get_Area() {
        return length * width;
    }

    // Perimeter Getter
    float Get_Perimeter() {
        return length * 2 + width * 2;
    }
}
// Ahmed Ghaith