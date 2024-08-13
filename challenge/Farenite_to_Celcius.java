package challenge;

import java.util.Scanner;

public class Farenite_to_Celcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("convert degree farenite to degree celcius : ");
        System.out.println("Enter the degree farenite : ");
        float f = input.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println(" degree celcius: " + c );



    }
}
