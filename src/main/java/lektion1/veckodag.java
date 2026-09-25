package lektion1;

import java.util.Scanner;

public class veckodag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv en veckodag (1-7): ");

        int day = scan.nextInt();
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };

        if (!name.equals("Invalid day")) {
            System.out.println("The day is: " + name + " and it is a " + type);
        } else {
            System.out.println(name);
        }

        scan.close();
    }
}
