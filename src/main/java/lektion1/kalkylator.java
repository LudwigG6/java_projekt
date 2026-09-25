package lektion1;

import java.util.Scanner;
    public class kalkylator {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


        System.out.print("ange tal nr. 1: ");

        double a = scan.nextDouble();

        System.out.print("ange tal nr. 2: ");

        double b = scan.nextDouble();

        System.out.printf("Summan av " + a + " och " + b + " är: %.2f%n", (a + b));
        System.out.printf("differensen av " + a + " och " + b + " är: %.2f%n", (a - b));
        System.out.printf("produkten av " + a + " och " + b + " är: %.2f%n", (a * b));;
        System.out.printf("kvoten av " + a + " och " + b + " är: %.2f%n", (a / b));
        System.out.printf("restvärdet av " + a + " och " + b + " är: %.2f%n", (a % b));
        scan.close();
        }
}
