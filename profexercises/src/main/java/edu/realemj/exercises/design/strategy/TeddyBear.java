package edu.realemj.exercises.design.strategy;

public class TeddyBear extends Bear {
    public TeddyBear() {
        super(new NoMove());
    }
}
