package Lesson_04_Foor_Loop;

import java.util.Scanner;

public class NumberOnPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int step = 0; step <= n; step +=2) {

            System.out.println(Math.pow(2, step = step));
        }

    }
}