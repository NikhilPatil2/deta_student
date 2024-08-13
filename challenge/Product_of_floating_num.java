package challenge;

import java.util.Scanner;

public class Product_of_floating_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st floting number : ");
        float firstnum = input.nextFloat();
        System.out.println("Enter the 2nd floating number : ");
        float secondnum = input.nextFloat();
        float mul = firstnum * secondnum;
        System.out.println("PRoduct of floating number is : " + mul);
    }
}
