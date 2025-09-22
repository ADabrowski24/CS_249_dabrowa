package edu.realemj.exercises.basic;

import java.util.Scanner;

public class FoodRationer {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Get total food,
        // total number of people,
        // and rations
        System.out.println("Enter total food:");
        double totalFood = input.nextDouble();
        System.out.println("Enter number of people:");
        int numPeople = input.nextInt();
        //double rations = 2.5;
        final double RATIONS = 2.5;

        int x = (int)1.0;

        // Calculate food per day
        double foodPerDay = numPeople * RATIONS;

        // Calculate how many days
        double daysLeft = totalFood / foodPerDay;

        // Print answer
        System.out.println("Days left: " + daysLeft);
        System.out.printf("Days left: %.3f\n", daysLeft);
        System.out.printf("Number of people: %05d\n", numPeople);

        String status = String.format("%d people survived.", numPeople);
        System.out.println(status);

        int ic = 65;
        char c = (char)ic;
        System.out.println("Also character is..." + c);

        String s = "" + 9;

    }
}
