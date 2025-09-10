package week_1;

import java.util.Scanner;

public class exercise_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int first = reader.nextInt();

        System.out.println("Type another number:");
        int second = reader.nextInt();

        int sum = first + second;
        System.out.println("Sum of the numbers: " + sum);

    }
}
