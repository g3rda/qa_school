package HW2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number, factorial=1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter number from 5 to 15: ");
            number = scan.nextInt();
        }while(number<=4 || number>=16);
        for(int i =1; i<=number; i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+number+ " is "+ factorial);


    }
}
