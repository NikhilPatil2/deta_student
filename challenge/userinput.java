package challenge;

import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.println("Enter Your Name :-");
        String name = Input.nextLine();
        System.out.println("Good Morning " + name );
        System.out.println(name + ",also enter your age");
        int age = Input.nextInt();
        System.out.println(age + ",is your age.");
    }
}
