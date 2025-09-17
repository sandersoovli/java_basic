package week_3;

import java.util.ArrayList;

public class exercise_60 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);

        System.out.println("the sum: " + sum(numbers));
        numbers.add(-1);

        System.out.println("the sum: " + sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
