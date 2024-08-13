package challenge;

import java.util.Scanner;

public class addtion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int firstnum = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int secondnum = input.nextInt();
       int sum = firstnum + secondnum;
        System.out.println("Enter sum: " + sum);
    }
}
