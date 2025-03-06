// Demonstrating Static Variables
class Student_Class {
    // Initializing A Static Variable => The Total Number Of Students With 0
    private static int Number_Of_Students = 0;
    // Final StudentID Because The ID Cannot Be Edited Later
    private final int Student_ID;
    // Constructor To Be Called When Creating An Object From The Student Class
    Student_Class() {
        // Increment The Number Of Students
        Number_Of_Students++;
        // Set Student ID
        Student_ID = Number_Of_Students;
    }

    // Get Student ID
    public int Get_Student_ID() {
        return Student_ID;
    }

    // Static Function To Increment The Number Of Students Manually
    public static void increment() {
        Number_Of_Students++;
    }

    // Static Function To Show The Number Of Students
    public static void Show_Number_Of_Students() {
        System.out.println("Number Of Students = " + Number_Of_Students + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating 2 Objects From The Student_Class To Test And Demonstrate Static Variable
        Student_Class Student = new Student_Class();
        Student_Class Student2 = new Student_Class();

        // Outputting IDs Of Created Students
        System.out.println("ID = " + Student.Get_Student_ID());
        System.out.println("ID = " + Student2.Get_Student_ID());

        // A Static Method Can Be Called Using The Class Name And Does Not Need An Object Of That Type To Be Called

        // Before Increment
        System.out.println("----Before Increment----\n");
        Student_Class.Show_Number_Of_Students();
        // Increment
        Student_Class.increment();
        // After Increment
        System.out.println("----After Increment----\n");
        Student_Class.Show_Number_Of_Students();
    }
}
