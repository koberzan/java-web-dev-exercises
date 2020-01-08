package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallon;
        double mpg;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven:");
        miles = input.nextDouble();

        System.out.println("Enter gallons used:");
        gallon = input.nextDouble();
        input.close();

        mpg = miles/gallon;
        System.out.println("Your miles per gallon are " + mpg);
    }
}
