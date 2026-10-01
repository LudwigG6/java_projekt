package lektion3;

public class refaktorering_av_fizzbuzz {
    public static void main(String[] args) {  // rad 1
        for (int i = 1; i <= 100; i++)       // rad 2
            System.out.println(getFizzBuzz(i)); // rad 3
    }


    public static String getFizzBuzz(int number){
            if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(number);
            }
    }

}
