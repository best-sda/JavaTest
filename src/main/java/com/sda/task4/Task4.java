package com.sda.task4;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String phrase = scanner.nextLine();
        System.out.print("Input substring: ");
        String world = scanner.nextLine();
        int count = StringUtils.countMatches(phrase.toUpperCase(), world.toUpperCase());
        System.out.println("The word occurs " + count + " times in the above string");
    }

}
