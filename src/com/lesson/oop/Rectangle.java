package com.lesson.oop;

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator() {
        return side1 * side2;
    }

    public double perimeterCalculator() {
        return 2 * (side1 + side2);
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть першу довжину: ");
        double side1 = scanner.nextDouble();

        System.out.print("Введіть другу довжину: ");
        double side2 = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);

        System.out.println("Площа прямокутника: " + rectangle.areaCalculator());
        System.out.println("Периметр прямокутника: " + rectangle.perimeterCalculator());
    }
}
