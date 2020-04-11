package HW2;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the stripes: ");
        int number = scan.nextInt();
        int p=0;
        for(int i = 0; i<6; i++){
            for(int j =0; j<number; j++){
                if(p%2==0) System.out.print("***");
                else System.out.print("+++");
                p++;
            }
            p=0;
            System.out.println();
        }
    }
}
