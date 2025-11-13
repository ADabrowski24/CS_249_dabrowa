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

        String [] randos = {
                "Bob", "Joe", "Susy", "SmittyWerbenJaegerManJensen"
        };

        while(!isGameOver(party, supplies)) {
            if(supplies.getTotalFood() <= 0) {
                // Uh-oh
                party.killRandomPerson();
            }

            if(Math.random() > 0.5) {
                int randoIndex = (int)(Math.random()*randos.length);
                party.addPerson(randos[randoIndex]);
                System.out.println("NEW PERSON!");
            }

            if(Math.random() > 0.8) {
                int randoIndex = (int)(Math.random()*party.getPartyCnt());
                String name = party.getPerson(randoIndex);
                party.removePerson(name);
                System.out.println(name + " ABANDONED US!");
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
