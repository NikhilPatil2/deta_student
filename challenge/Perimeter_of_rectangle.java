package challenge;

import java.util.Scanner;

public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter of Rectangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Perimeter : " + perimeter);


    }
}
