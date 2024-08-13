package challenge;

import java.util.Scanner;

public class welcomr {
    public static void main(String[] args) {
        System.out.println("Enter Your Name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name +" KG Codding");
    }
}
