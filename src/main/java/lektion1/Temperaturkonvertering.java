package lektion1;

import java.util.Scanner;

public class Temperaturkonvertering {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Vilken skala matar du in?");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        int choice = scan.nextInt();

        System.out.print("Ange temperatur: ");
        double temp = scan.nextDouble();

        switch (choice) {
            case 1 -> {
                double fahrenheit = (temp * 9 / 5) + 32;
                double kelvin = temp + 273.15;

                System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
                System.out.printf("Kelvin: %.2f%n", kelvin);
            }

            case 2 -> {
                double celsius = (temp - 32) * 5 / 9;
                double kelvin = celsius + 273.15;

                System.out.printf("Celsius: %.2f%n", celsius);
                System.out.printf("Kelvin: %.2f%n", kelvin);
            }

            case 3 -> {
                double celsius = temp - 273.15;
                double fahrenheit = (celsius * 9 / 5) + 32;

                System.out.printf("Celsius: %.2f%n", celsius);
                System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
            }

            default -> System.out.println("Ogiltigt val");
        }

        scan.close();
    }
}