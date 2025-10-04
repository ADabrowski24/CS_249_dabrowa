package edu.dabrowa.assign03;

import java.util.*;

public class Hallmark {
    public static GreetingCard generateCard(Scanner input){
        System.out.println("Enter boundary character:");
        String temp=input.nextLine();
        char boundaryChar=temp.charAt(temp.length()-1);

        System.out.println("Enter number of lines:");
        temp =input.nextLine();
        int numLines= Integer.parseInt(temp);

        System.out.println("Enter lines:");
        String[] allLines=new String[numLines];
        for(int i=0;i<numLines;i++)
            allLines[i]=input.nextLine();
        return new GreetingCard(allLines,boundaryChar);
        }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        GreetingCard n =generateCard(sc);

        System.out.println("For any occasion:");
        System.out.println(n);
    }

}

