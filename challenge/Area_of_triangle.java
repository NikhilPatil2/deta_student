package challenge;
import java.util.Scanner;

public class Area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Area of triangle ");
        System.out.print("Enter the breth : ");
        double b = input.nextDouble();
        System.out.print("Enter the height : ");
        double h = input.nextDouble();
        double area = 0.5 * h * b ;
        System.out.println("Area of Triangle is : " + area + "  cm2");

    }
}
