package edu.realemj.exercises.loops;

import java.util.Scanner;

public class FoodCounter {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int totalFood = 0;
        int food = 0;

        do {
            System.out.println("Enter food to buy/sell:");
            food = input.nextInt();
            totalFood += food;
        } while(food != 0);

    }
}
