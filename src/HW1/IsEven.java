package HW1;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one number:");
        a = scan.nextInt();
        if(a%2==0) System.out.println(true);
        else System.out.println(false);
    }
}
