package edu.realemj.exercises.oregon;

import java.util.*;

public class OregonTrail {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        Party party = Party.askForPartyMembers(input);
        System.out.println(party);

        Supplies supplies = new Supplies();
        System.out.println(supplies);

        int daysOnTrail = 0;

        while(!isGameOver(party, supplies)) {
            if(supplies.getTotalFood() <= 0) {
                // Uh-oh
                party.killRandomPerson();
            }

            daysOnTrail++;
            System.out.println("** DAY " + daysOnTrail + " ****");
            System.out.println(party);
            System.out.println(supplies);
        }

        System.out.println("Did we make it?");
    }

    public static boolean isGameOver(Party party, Supplies supplies) {
        int aliveCnt = party.getAliveCnt();

        if(aliveCnt <= 0) {
            return true;
        }

        return false;
    }
}
