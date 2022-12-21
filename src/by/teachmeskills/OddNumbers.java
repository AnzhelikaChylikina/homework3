package by.teachmeskills;

public class OddNumbers {
    public static void main(String[] args) {
        for (int number = 1; number <= 99; number++) {
            if (number % 2 != 0) {
                System.out.println("Odd numbers from 99 to 1: " + number);
            }
        }
    }
}
