package lektion3;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userInput = InputHelper.readIntBetween(scanner, "Hur gammal är du?", 0, 150);

        System.out.println("Du är " + userInput + " år gammal.");
    }
}
