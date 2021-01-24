package com.sda.task5;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = scanner.nextInt();
        System.out.print("Palindrome: ");
        IntStream.range(1, n).forEach(i -> {
            StringBuilder temp = new StringBuilder(String.valueOf(i));
            String str = temp.toString();
            String str2 = temp.reverse().toString();
            if (str.equals(str2)) System.out.print(str + " ");
        });
    }

}
