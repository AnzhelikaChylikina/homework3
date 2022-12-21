package by.teachmeskills;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int eNumber = sc.nextInt();
        int result = 0;
        for (int number = 1; number <= eNumber; number++) {
            result = result + number;
        }
        System.out.println("Number sum: " + result);
    }
}