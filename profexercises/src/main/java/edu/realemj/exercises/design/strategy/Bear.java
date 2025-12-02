package edu.realemj.exercises.design.strategy;

public abstract class Bear {
    private MoveBehavior moveBehavior;

    public Bear(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void performMove() {
        moveBehavior.move();
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
}
