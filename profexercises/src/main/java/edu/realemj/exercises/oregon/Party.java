package edu.realemj.exercises.oregon;

import java.util.*;

public class Party {
    //private Person [] people;
    private ArrayList<Person> people = new ArrayList<>();

    public Party(String [] names) {
        //people = new Person[names.length];
        //for(int i = 0; i < people.length; i++) {
        //    people[i] = new Person(names[i]);
        //}

        for(String name: names) {
            people.add(new Person(name));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("** PARTY *********\n");
        //for(Person p: people) {
        for(int i = 0; i < people.size(); i++) {
            sb.append("(");
            sb.append((i+1));
            sb.append(") ");
            sb.append(people.get(i));
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
        ArrayList<Person> aliveList = new ArrayList<>();

        for(Person p: people) {
            if(p.isAlive()) {
                aliveList.add(p);
            }
        }

        if(aliveList.isEmpty()) {
            return false;
        }

        int randIndex = (int)(Math.random()*aliveList.size());
        aliveList.get(randIndex).unalive();
        return true;

        /*
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
         */
    }

    public void addPerson(String name) {
        Person p = new Person(name);
        people.add(p);
    }

    public boolean removePerson(String name) {
        Person p = new Person(name);
        return people.remove(p);
    }

    public boolean checkForPerson(String name) {
        return people.contains(new Person(name));
    }

    public int getPartyCnt() {
        return people.size();
    }

    public String getPerson(int index) {
        return people.get(index).getName();
    }

}
