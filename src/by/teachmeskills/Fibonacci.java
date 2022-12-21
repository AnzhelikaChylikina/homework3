package by.teachmeskills;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int number = 2; number < 11; number++) {
            int currFib = n1 + n2;
            System.out.println(currFib);
            n1 = n2;
            n2 = currFib;
        }
    }
}
