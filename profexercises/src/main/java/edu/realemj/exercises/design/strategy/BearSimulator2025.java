package edu.realemj.exercises.design.strategy;

public class BearSimulator2025 {
    public static void main(String [] args) {
        Bear norman = new PolarBear();
        Bear pooh = new TeddyBear();

        norman.performMove();
        pooh.performMove();
        pooh.setMoveBehavior(new MoveWithFourLegs());
        pooh.performMove();
    }
}

