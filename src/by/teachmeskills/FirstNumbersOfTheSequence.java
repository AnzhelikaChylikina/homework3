package by.teachmeskills;

public class FirstNumbersOfTheSequence {
    public static void main(String[] args) {
        int number = 0;
        for (int n = 0; n < 9; n++) {
            System.out.print(number + ",");
            number = number - 5;
        }
        System.out.println(number);
    }
}
