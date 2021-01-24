package com.sda.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input text: ");
        String phrase = scanner.nextLine();
        ArrayList <String> words = new ArrayList <>(Arrays.asList(phrase.split(" ")));
        ArrayList <String> result = new ArrayList <>();
        words.sort(String::compareToIgnoreCase);
        words.forEach(it -> {
            char[] word = it.toCharArray();
            word[0] = Character.toUpperCase(word[0]);
            result.add(String.valueOf(word));
        });
        System.out.println("Word count = " + words.size());
        System.out.println(result);

    }
}
