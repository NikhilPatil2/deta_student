package challenge;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate the area of circle");
        System.out.println("Enter the radius of circle : ");
        float radius = input.nextFloat();
        float area = (float) (Math.PI* ( radius*radius));
        System.out.println(area);
    }
}
