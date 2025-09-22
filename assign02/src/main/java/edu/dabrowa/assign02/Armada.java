package edu.dabrowa.assign02;

import java.util.Scanner;

public class Armada {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        SpaceVessel vessel=new SpaceVessel();

        System.out.println("Enter vessel name:");
        String name=scan.nextLine();

        System.out.println("Enter length and weight:");
        String line=scan.nextLine();
        Scanner parseLine=new Scanner(line);

        int length=parseLine.nextInt();
        int weight=parseLine.nextInt();

        vessel.setName(name);
        vessel.setLength(length);
        vessel.setWeight(weight);

        System.out.println(vessel.toString());

    }
    }

