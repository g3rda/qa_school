package HW2;

import java.util.Scanner;

public class ApartmentNumber {
    public static void main(String[] args) {
        int [][][] house = new int [4][9][4];
        int apartmentNumber = 1;
        boolean flag = false;
        for(int i =0; i<house.length; i++){
            for (int j =0; j<house[i].length; j++){
                for(int k =0; k<house[i][j].length; k++){
                    house[i][j][k] = apartmentNumber;
                    apartmentNumber++;
                    System.out.print(house[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the apartment:");
        apartmentNumber = scan.nextInt();
        for(int i =0; i<house.length; i++){
            for (int j =0; j<house[i].length; j++){
                for(int k =0; k<house[i][j].length; k++){
                    if(house[i][j][k] == apartmentNumber) {
                        System.out.print("The apartment is on the " + (j + 1) + " floor, entrance number " + (i + 1));
                        break;
                    }
                }
            }
        }

    }
}
