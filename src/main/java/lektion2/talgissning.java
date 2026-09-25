package lektion2;

public class talgissning {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int  guess = 0;
        int attempts = 0;

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println(secretNumber);
        System.out.println("Gissa ett tal mellan 1 och 100: ");
        while (guess != secretNumber) {
            guess = scanner.nextInt();
            attempts ++;
            if (guess < secretNumber){
                System.out.println("För lågt! Gissa igen: ");
            } else if (guess > secretNumber){
                System.out.println("För högt! Gissa igen: ");
            } else {
                System.out.println("Grattis! Du gissade rätt på " + attempts + " försök.");
            }
        }
    }
}
