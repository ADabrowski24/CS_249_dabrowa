package edu.realemj.exercises.selection;

import edu.realemj.exercises.oregon.Disaster;

public class BadDay {
    public static void checkDisaster(Disaster d) {
        int totalFood = 100;

        switch(d) {
            case CHOLERA, DYSENTERY -> System.out.println("COUGH.");
            case LOST_FOOD -> {
                double y = 6.0;
                totalFood -= 10;
                System.out.println("Total food down to " + totalFood);
            }
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN ->
                    System.out.println("WAGON STOPPED.");
            default -> System.out.println("ALL GOOD");
        }
    }

    public static void main(String [] args) {
        checkDisaster(Disaster.DYSENTERY);
        checkDisaster(Disaster.LOST_FOOD);
    }
}
