package edu.realemj.exercises.oregon;

import java.util.*;

public class Party {
    private Person [] people;

    public Party(String [] names) {
        people = new Person[names.length];
        for(int i = 0; i < people.length; i++) {
            people[i] = new Person(names[i]);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** PARTY *********\n");
        for(Person p: people) {
            sb.append("* ");
            sb.append(p);
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Party askForPartyMembers(Scanner input) {
        System.out.println("How many people in your party?");
        String cntS = input.nextLine();
        int cnt = Integer.parseInt(cntS);
        String [] names = new String[cnt];
        System.out.println("Enter your party member names (one per line):");
        for(int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        //Party p = new Party(names);
        //return p;
        return new Party(names);
    }

    public int getAliveCnt() {
        int aliveCnt = 0;
        for(Person p: people) {
            if(p.isAlive()) {
                aliveCnt++;
            }
        }
        return aliveCnt;
    }

    public boolean killRandomPerson() {
        int aliveCnt = getAliveCnt();
        if(aliveCnt <= 0) {
            return false;
        }

        int [] indices = new int[aliveCnt];
        int nextIndex = 0;
        for(int i = 0; i < people.length; i++) {
            if(people[i].isAlive()) {
                indices[nextIndex] = i;
                nextIndex++;
            }
        }

        int randIndex = (int)(Math.random()*indices.length);
        int unluckyIndex = indices[randIndex];
        people[unluckyIndex].unalive();
        return true;
    }

}
