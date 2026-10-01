package lektion3;

import java.util.ArrayList;
import java.util.Scanner;

public class PokeCRUDupdated {
    public static void main(String[] args) {




        ArrayList<String> pokedex = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Pokémon Database ---");
            System.out.println("1. Skapa ny pokémon");
            System.out.println("2. Updatera en pokémon");
            System.out.println("3. Ta bort en pokémon");
            System.out.println("4. Lista alla pokémon");
            System.out.println("5. Avsluta");

            System.out.println("\n--- Välj ett alternativ: ---");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    createPokemon(scanner, pokedex);
                    break;
                case "2":
                    updatePokemon(scanner, pokedex);
                    break;
                case "3":
                    deletePokemon(scanner, pokedex);
                    break;
                case "4":
                    viewPokedex(pokedex);
                    break;
                case "5":
                    System.out.println("Avslutar programmet....");
                    running = false;
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
                    break;
            }
        }
        scanner.close();
    }

    public static void createPokemon(Scanner scanner, ArrayList<String> pokedex) {
        System.out.println("****************");
        System.out.println("Skapa ny Pokémon");
        System.out.println("****************");
        System.out.println("Vad heter den nya pokémonen?: ");
        String newPokémon = scanner.nextLine();
        pokedex.add(newPokémon);
        System.out.println(newPokémon + " har lagts till i pokédexen!");
    }

    public static void updatePokemon(Scanner scanner, ArrayList<String> pokedex) {
        System.out.println("*******************");
        System.out.println("Updatera en Pokémon");
        System.out.println("*******************");

        if (pokedex.size() == 0) {
            System.out.println("Det finns inga pokémoner att updatera.");
        } else {
            for (int i = 0; i < pokedex.size(); i++) {
                System.out.println((i + 1) + ". " + pokedex.get(i));
            }
            System.out.println("Vilken pokémon vill du updatera? (ange nummer): ");
            int indexToUpdate = Integer.parseInt(scanner.nextLine()) - 1;
            if (indexToUpdate >= 0 && indexToUpdate < pokedex.size()) {
                System.out.println("Ändra " + pokedex.get(indexToUpdate) + " till: ");
                String newName = scanner.nextLine();
                pokedex.set(indexToUpdate, newName);
                System.out.println("Pokémonen har updaterats!");
            } else {
                System.out.println("Ogiltigt val.");
            }
        }
    }

    public static void deletePokemon(Scanner scanner, ArrayList<String> pokedex) {
        System.out.println("*******************");
        System.out.println("Ta bort en Pokémon");
        System.out.println("*******************");

        if (pokedex.size() == 0) {
            System.out.println("Det finns ingen pokémon att ta bort.");
        } else {
            for (int i = 0; i < pokedex.size(); i++) {
                System.out.println((i + 1) + ". " + pokedex.get(i));
            }
            System.out.println("Vilken pokémon vill du ta bort? (ange nummer): ");
            int indexToDelete = Integer.parseInt(scanner.nextLine()) - 1;
            if (indexToDelete >= 0 && indexToDelete < pokedex.size()) {
                String deletedPokemon = pokedex.get(indexToDelete);
                pokedex.remove(indexToDelete);
                System.out.println(deletedPokemon + " har tagits bort!");
            } else {
                System.out.println("Ogiltigt val.");
            }

        }
    }

    public static void viewPokedex(ArrayList<String> pokedex) {
        System.out.println("*******************");
        System.out.println("Lista alla Pokémon");
        System.out.println("*******************");

        if (pokedex.size() == 0) {
            System.out.println("Det finns inga pokémoner i pokédexen.");
        } else {
            printNumberedList(pokedex);
        }
    }

    public static void printNumberedList (ArrayList < String > List) {
        for (int i = 0; i < List.size(); i++) {
            System.out.println((i + 1) + ". " + List.get(i));
        }
    }


}

