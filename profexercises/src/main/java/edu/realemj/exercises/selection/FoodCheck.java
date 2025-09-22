package edu.realemj.exercises.selection;

public class FoodCheck {
    public static void main(String [] args) {

        int totalFood = 10;
        boolean haveDysentery = true;

        boolean outOfFood = (totalFood <= 0);

        boolean haveOneProblem = (totalFood <= 0) ^ haveDysentery;

        for(int i = 0; i < 12; i++) {
            outOfFood = (totalFood <= 0);

            if(outOfFood) {
                System.out.println("WE'RE GONNA STARVE!!!");
            }
            else {
                System.out.println("Food left: " + totalFood);
            }
            totalFood--;
        }

    }
}
