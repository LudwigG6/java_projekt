package lektion2;

import java.util.Scanner;

public class meny {
    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Välkommen till menyn");
        System.out.println("Vad heter du? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        while(running){

        System.out.print("Hej " + name + ". Välj ett alternativ: ");
        System.out.println(" ");
        System.out.println("1. FizzBuzz");
        System.out.println("2. Gissa Talet");
        System.out.println("3. Avsluta");

        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                FizzBuzz.main(args);
                break;
            case 2:
                talgissning.main(args);
                break;
            case 3:
                System.out.println("Avslutar programmet.");
                running = false;
                break;
            default:
                System.out.println("Ogiltigt val.");
                break;
        }
        }
    }
}
