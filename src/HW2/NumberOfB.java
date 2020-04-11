package HW2;

import java.util.Scanner;

public class NumberOfB {
    public static void main(String[] args) {
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some string:");
        string = scan.nextLine();
        int count = 0;
        for(int i =0; i<string.length(); i++)
        {
            if(string.charAt(i)=='b')  count++;
        }
        System.out.println("Number of 'b' in the string: "+count);
    }
}
