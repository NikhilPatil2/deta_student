package challenge;

import java.util.Scanner;

public class Compoun_Intrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, calculate the Compound Intrest: ");
        System.out.println("Enter the principal value Rs : " );
        int principal = input.nextInt();
        System.out.println("Enterr your rate: ");
        float rate = input.nextFloat();
        System.out.println("The tome period you required for it : ");
        float year = input.nextFloat();
        float Compound = principal *(1 + rate / 100) * year ;
        System.out.println("Compound Intrest : " + Compound + " RS");
        }
    }
