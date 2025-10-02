package edu.realemj.exercises.loops;

import java.util.Scanner;
import edu.realemj.exercises.oregon.*;

public class DoWhilesStore {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Supplies supplies = new Supplies();
        GeneralStore store = new GeneralStore();
        store.enter(input, supplies);
        System.out.println("SUPPLIES AFTER SHOPPING:");
        System.out.println(supplies.toString());
        System.out.println("DONE");
        Object c = new Object();
        c.toString();

    }
}
