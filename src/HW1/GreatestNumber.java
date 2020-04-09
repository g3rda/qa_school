package HW1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if (a>b){
            if(a>c) System.out.println("The greatest number is: "+ a);
            else System.out.println("The greatest number is "+c);
        }
        else{
            if(b>c) System.out.println("The greatest number is "+b);
            else System.out.println("The greatest number is "+c);
        }
    }
}
