package HW2;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the elements in array: ");
        int number = scan.nextInt();
        int [] array = new int[number];
        Random random = new Random();
        for (int i=0; i<number; i++)
        {
            array[i]= random.nextInt(50);
        }
        System.out.print("The array: ");
        for(int i=0; i<number; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
