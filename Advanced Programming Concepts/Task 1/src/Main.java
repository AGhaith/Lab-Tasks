import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt(), y = input.nextInt();
        int z = x+y;
        int z2= x-y;
        int z3 = x*y;
        System.out.println("Sum = "+z);
        System.out.println("Difference = "+z2);
        System.out.println("Product = "+z3 );

        Rectangle myrect = new Rectangle();
        float length=input.nextFloat() , width=input.nextFloat();
        myrect.setlength(length);
        myrect.setwidth(width);
        System.out.println("Area = "+myrect.getArea() + "Perimeter = " + myrect.getPerimeter());

    }
}