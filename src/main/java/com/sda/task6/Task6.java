package com.sda.task6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList <Item> itemsList = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set backpack weight: ");
        int weight = scanner.nextInt();
        Knapsack knapsack = new Knapsack(weight);
        System.out.print("Set number of things: ");
        int col = scanner.nextInt();
        for (int i = 0; i < col; i++) {
            System.out.println("Set weight " + (i + 1) + " thing:");
            System.out.println("Set cost " + (i + 1) + " thing:");
            Item thing = new Item(scanner.nextInt(), scanner.nextInt());
            itemsList.add(thing);
        }
        int[][] solution = new int[col + 1][knapsack.getCarryingCapacity() + 1];
        for (int i = 0; i <= col; i++)
            for (int j = 0; j <= knapsack.getCarryingCapacity(); j++) {
                solution[i][j] = 0;
            }

        for (int i = 1; i <= col; i++) {
            for (int j = 0; j <= knapsack.getCarryingCapacity(); j++) {
                solution[i][j] = solution[i - 1][j];
                if ((j >= itemsList.get(i - 1).getWeight())
                        && (solution[i][j] < solution[i - 1][j - itemsList.get(i - 1).getWeight()]
                        + itemsList.get(i - 1).getCost())) { solution[i][j] =
                        solution[i - 1][j - itemsList.get(i - 1).getWeight()] + itemsList.get(i - 1).getCost();
                }
            }
        }

        System.out.println("Max cost:" + solution[col][knapsack.getCarryingCapacity()]);
        System.out.println("Selected items: ");

        while (col != 0) {
            if (solution[col][knapsack.getCarryingCapacity()] != solution[col - 1][knapsack.getCarryingCapacity()]) {
                System.out.println("Item " + col + " with weight = " + itemsList.get(col - 1).getWeight()
                        + " and cost = " + itemsList.get(col - 1).getCost());
                knapsack.setCarryingCapacity(knapsack.getCarryingCapacity() - itemsList.get(col - 1).getWeight());
            }
            col--;
        }
    }

}