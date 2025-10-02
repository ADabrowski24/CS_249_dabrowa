package edu.realemj.exercises.oregon;

import java.util.Scanner;

public class GeneralStore {

    public void enter(Scanner input, Supplies supplies) {
        boolean done = false;

        do {
            printStorePrompt();
            int value = input.nextInt();
            String item = input.next();
            item = item.toLowerCase();
            SupplyType supply = SupplyType.getType(item);

            // TODO: Check in stock
            if(value == 0 || supply == null) {
                done = true;
            }
            else {
                if(!attemptPurchase(value, supply, supplies)) {
                    System.out.println("I can't do that transaction!");
                }
            }

            System.out.println(supplies);

        } while(!done);
    }

    public void printStorePrompt() {
        System.out.println("** MR. DO-WHILE'S EMPORIUM *****");
        System.out.println("What do you want to buy/sell, stranger?");
        for(SupplyType st : SupplyType.values()) {
            System.out.println("* " + st.getName());
        }
    }

    public boolean attemptPurchase(int value,
                                   SupplyType supply,
                                   Supplies supplies) {
        return supplies.add(supply, value);
    }
}
