package week_3;

import java.util.ArrayList;
import java.util.Collections;

public class exercise_50 {
        public static void main(String[] args) {
            ArrayList<String> dogs = new ArrayList<>();
            dogs.add("Mark");
            dogs.add("Lisa");
            dogs.add("Emma");
            dogs.add("Anthony");
            dogs.add("John");

            Collections.sort(dogs);

            for (String dog : dogs) {
                System.out.println(dog);
            }
        }
}
