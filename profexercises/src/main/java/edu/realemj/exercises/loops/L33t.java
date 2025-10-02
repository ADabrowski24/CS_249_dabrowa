package edu.realemj.exercises.loops;

import java.util.*;

public class L33t {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        do {
            System.out.println("Enter line:");
            line = input.nextLine();
            String l33tLine = "";
            for(int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                char nc = switch(c) {
                    case 'a','A' -> '4';
                    case 'e','E' -> '3';
                    case 'i','I' -> '1';
                    case 'o','O' -> '0';
                    default -> c;
                };
                l33tLine += nc;
            }
            System.out.println(l33tLine);
        } while(!line.isEmpty()); // line.length != 0
    }
}
