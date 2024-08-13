package challenge;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a;-");
        int a = Input.nextInt();
        System.out.println("Enter b:-");
        int b = Input.nextInt();
        //System.out.println("Enter c:-");
      //  int c = Input.nextInt();
int c = a;
 a = b;
 b= c;
        System.out.println("a ="+a);
        System.out.println("b ="+b);

    }
}
