package com.sda.task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static boolean isPrime(int number){
        BigInteger bigInteger = BigInteger.valueOf(number);
        return bigInteger.isProbablePrime((int) Math.log(number));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Not an integer number");
            scanner.next();
        }
        int number = scanner.nextInt();
        System.out.println("Number is " + (isEven(number)? "even": "not even") + " and "
                + (isPrime(number)? "prime" : "not prime") );
    }

}