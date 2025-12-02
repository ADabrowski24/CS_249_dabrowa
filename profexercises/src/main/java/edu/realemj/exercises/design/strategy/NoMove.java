package edu.realemj.exercises.design.strategy;

public class NoMove implements MoveBehavior {
    public void move() {
        System.out.println("No move!");
    }
}
