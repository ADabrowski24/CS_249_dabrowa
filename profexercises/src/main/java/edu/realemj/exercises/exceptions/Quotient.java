package edu.realemj.exercises.exceptions;

import java.util.*;
import java.io.*;

public class Quotient {
    public static int divide(int a, int b) throws IOException {
        if(b == 3) {
            throw new ArithmeticException("Not 3 please.");
        }

        if(b < 0) {
            throw new IOException("I don't like negative numbers as input.");
        }

        int c = a/b;
        return c;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter two WHOLE numbers:");
            int x = input.nextInt();
            int y = input.nextInt();
            int z = divide(x, y);
            System.out.println("Answer: " + z);
        }
        catch(ArithmeticException e) {
            System.err.println("YOU FOOL! YOU WILL TEAR THE UNIVERSE ASUNDER!");
            System.err.println("MESSAGE: " + e.getMessage());
        }
        catch(InputMismatchException e) {
            System.err.println("Have you lost the little sense you were born with?");
            System.err.println("Enter an integer...PLEASE.");
        }
        catch(Exception e) {
            System.err.println("I don't know what you did, but CLEARLY it was wrong.");
            System.err.println(e);
            e.printStackTrace();
        }

        System.out.println("DONE");
    }
}
