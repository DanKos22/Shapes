package ie.atu.week5;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {

        System.out.println("Please enter the length of the field");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();

        // First object is called shapeField
        Field shapeField = new Field();
        shapeField.setLength(length);
        System.out.println("You entered: " + length);

        System.out.println("Please enter the width of the field");
        double width = input.nextDouble();
        shapeField.setWidth(width);
        System.out.println("You entered: " + shapeField.getWidth());

        // Second object is shapeField2
        Field shapeField2 = new Field();
        System.out.println("Please enter the length for the 2nd field: ");
        double length2 = input.nextDouble();
        shapeField2.setLength(length2);
        System.out.println("You entered: " + shapeField2.getLength());

        System.out.println("Please enter the width for the 2nd field: ");
        double width2 = input.nextDouble();
        shapeField2.setWidth(width2);
        System.out.println("You entered: " + shapeField2.getWidth());
    }
}
