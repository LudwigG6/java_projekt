package lektion2;

public class räknaner {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");

        //skriv ut multiplikationstabellen 1-5 med nästlad loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
