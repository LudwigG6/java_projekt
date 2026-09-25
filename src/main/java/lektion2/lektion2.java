package lektion2;

public class lektion2 {
    public static void main(String[] args) {
        String text = " jAvA prOgrAmmErIng Är kUl! ";
        String upperCaseText = text.toUpperCase();
        String lowerCaseText = text.toLowerCase();
        String trimmedText = text.trim();

        System.out.println("Orginal text = " + text);


        if (lowerCaseText.contains("java")) {
            System.out.println("Texten innehåller 'java'");
        } else {
            System.out.println("Texten innehåller inte 'java'");

        }
        if (lowerCaseText.contains("kul")){
            lowerCaseText = lowerCaseText.replace("kul", "kraftfullt");
        }

        System.out.println("omvandlade texten: " + lowerCaseText.strip());
        System.out.println("Antal Tecken " + lowerCaseText.length() + ".");
    }
}
