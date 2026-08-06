package GitHub;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;

        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);

        sc.close();
    }
}