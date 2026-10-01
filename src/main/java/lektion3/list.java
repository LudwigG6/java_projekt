package lektion3;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Bertil");
        nameList.add("Anna");
        nameList.add("Cecilia");

        System.out.println(nameList.get(2));
        System.out.println(nameList.size());

        for (int i = 0; i< nameList.size(); i++){
            System.out.println("index" + i + " Håller namnet " + nameList.get(i));
        }

        nameList.remove("Bertil");

        System.out.println(nameList.size());


        for (String n : nameList){
            System.out.println(n);
        }





        /*
        String[] names = {"Anna", "Bertil", "Cecilia"};
        String userName = "Bertil";

        boolean exists = false;

        for (String name : names){
            if(name.equalsIgnoreCase(userName)){
                exists = true;
            }
        }

        if (exists){
            System.out.println(userName + " finns i listan");
        } else {
            System.out.println(userName + " finns inte i listan");
        }

        for (String name: names){
            System.out.println(name);
        }




        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 12;
        numbers[2] = 7;

        int[] numbers2 = {2, 77, 114};

        System.out.println(numbers.length);
        System.out.println(numbers2.length);
        System.out.println(numbers2[2]);
        */
    }
}
