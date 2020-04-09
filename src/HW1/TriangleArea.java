package HW1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double a,b,c, s;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lengths of the triangle sides: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        s = (a+b+c)/2;
        System.out.printf("The area of the triangle is %.2f", Math.sqrt(s*(s-a)*(s-b)*(s-c)));

    }
}
