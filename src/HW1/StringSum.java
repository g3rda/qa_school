package HW1;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        String a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = scan.nextLine();
        System.out.println("Enter second number:");
        b = scan.nextLine();
        c = Integer.toString(Integer.parseInt(a)+Integer.parseInt(b));
        System.out.println(a+" + "+b+" = "+c);
    }
}
