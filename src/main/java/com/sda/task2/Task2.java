package com.sda.task2;

import java.util.Scanner;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);

    private static int gcd(int numberOne, int numberTwo) {
        int temp;
        while (numberTwo != 0) {
            temp = numberTwo;
            numberTwo = numberOne % numberTwo;
            numberOne = temp;
        }
        return numberOne;
    }

    private static int lcm(int numberOne, int numberTwo) {
        return numberOne / gcd(numberOne, numberTwo) * numberTwo;
    }

    private static void checkInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("not a number");
            scanner.next();
        }
    }

    public static void main(String[] args) {
        System.out.print("Input number one: ");
        checkInt();
        int numberOne = scanner.nextInt();
        System.out.print("Input number two: ");
        checkInt();
        int numberTwo = scanner.nextInt();
        System.out.println("gcg = " + gcd(numberOne, numberTwo) +
                " lsm = " + lcm(numberOne, numberTwo));
    }
}
