package by.teachmeskills;

import java.util.Scanner;

public class DepositAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount: ");
        float deposit = sc.nextFloat();
        System.out.println("Enter number of years: ");
        int year = sc.nextInt();
        float percent = (float) 0.07;
        for (int i = 1; i <= year; i++) {
            float total = deposit * percent + deposit;
            deposit = total;
            System.out.println("Total deposit: " + total + ". For year: " + i);
        }
    }
}
