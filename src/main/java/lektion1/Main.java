package lektion1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hej! hur gammal är du? ");
        int userInput = Integer.parseInt(scan.nextLine());
        int age = userInput;
        if (age >= 18) {
            System.out.println("Du är myndig!");
        } else {
            System.out.println("Du är inte myndig!");
        }
        scan.close();




        double price = 199.0;

        int discountPercent = 20;
        double discount = price * discountPercent / 100;
        double finalPrice = price - discount;
        System.out.println("Du betalar: " + finalPrice + " kr");


    }
}
