package HW1;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        double a, b;
        double angle;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the lengths of the parallelogram sides: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        System.out.print("Enter the angle between the sides (in radians): ");
        angle = scan.nextInt();
        System.out.printf("The parallelogram area equals %.2f", a*b*Math.sin(angle));

    }
}
