package edu.realemj.exercises.design.strategy;

public class PolarBear extends Bear {
    public PolarBear() {
        super(new MoveWithFourLegs());
    }
}
