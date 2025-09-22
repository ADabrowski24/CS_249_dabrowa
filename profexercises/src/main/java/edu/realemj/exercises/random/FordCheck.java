package edu.realemj.exercises.random;

import java.util.*;

public class FordCheck {
    public static void main(String [] args) {
        long seed = System.currentTimeMillis();
        Random randGen = new Random(seed);

        boolean success = randGen.nextBoolean();
        if(!success) {
            System.out.println("You drowned...why did you ford?");
        }
        else {
            System.out.println("Lucky...");
        }

        int successCnt = 0;
        int totalCnt = 10000;
        for(int i = 0; i < totalCnt; i++) {
            success = randGen.nextBoolean();
            if(success) {
                successCnt++;
            }
        }
        double successRate = successCnt/(double)totalCnt;
        System.out.println("Success rate: " + successRate);

        long answer = 42;
        Random r1 = new Random(answer);
        Random r2 = new Random(answer);

        for(int i = 0; i < 10; i++) {
            System.out.println(r1.nextInt() + " " + r2.nextInt());
        }

    }
}
