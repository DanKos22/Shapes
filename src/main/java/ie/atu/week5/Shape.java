package ie.atu.week5;

import java.util.Scanner;

public class Shape {

    public static void main(String[] args) {

        System.out.println("Please enter the length of the field");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered: " + length);

        System.out.println("Please enter the width of the field");
        double width = input.nextDouble();
        System.out.println("You entered: " + width);
    }
}
