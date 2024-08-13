package challenge;

import java.util.Scanner;

public class Simplecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // int a;
       // int b;
        System.out.print("Enter the value of A : ");
        int a = input.nextInt();
        System.out.print("Enterr the value of B : ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("Addtion of two number : " + sum);
        int sub = a - b;
        System.out.println("Subtraction of two number : " + sub);
        int mul = a * b;
        System.out.println("Multiplication of two numbers : " + mul);
        int div = a/b;
        System.out.println("Division of two numbers : " + div);
        float per = a % b;
        System.out.println("Percentile value  of numbers : "+ per);


    }
}
