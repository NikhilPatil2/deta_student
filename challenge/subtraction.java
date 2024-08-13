package challenge;

import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number:-");
        int fistnum = input.nextInt();
        System.out.println("Enter 2nd number:-");
        int secondnum = input.nextInt();
        int sub = fistnum * secondnum;
        System.out.println("subraction :"+ sub);
    }
}
