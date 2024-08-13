package challenge;

import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Intrest ");
        System.out.println("Enter Principal amount Rs : ");
        int principal = input.nextInt();
        System.out.print("Enter time period  in Year: ");
        float period = input.nextFloat();
        System.out.print("Enter the intrrest rate :");
        double rate = input.nextDouble();
        double intrest = (principal * period * rate) / 100;
        System.out.print("Simple Intrest is : " + intrest);

    }
}
