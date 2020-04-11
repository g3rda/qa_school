package HW2;

import java.util.Random;
import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args) {
        int [] array = new int[15];
        Random random = new Random();
        for (int i=0; i<15; i++)
        {
            array[i]= random.nextInt(50);
        }
        int [] arrayCopied = new int[30];
        for (int i =0; i<30; i++){
            if(i<15) arrayCopied[i] = array[i];
            else arrayCopied[i] = array[i%15]*2;
        }
        System.out.print("First array:  ");
        for(int i=0; i<15; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Second array: ");
        for(int i=0; i<30; i++)
        {
            System.out.print(arrayCopied[i] + " ");
        }
    }
}
