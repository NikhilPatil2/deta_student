package challenge;

import java.util.Scanner;

public class Positive_Negative_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine the number is Positive/ Negative");
        System.out.println("Enter the Number: ");
        int num = input.nextInt();
        if(num > 0)
            System.out.println("Number is positive: ");
        else if (num == 0)
            System.out.println("Number is zero: ");
        else
            System.out.println("Number is negative: ");

    }
}
