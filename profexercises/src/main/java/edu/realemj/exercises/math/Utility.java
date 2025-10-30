package edu.realemj.exercises.math;

public class Utility {
    public static final double EPS = 1e-10;

    public static boolean equals(double a, double b) {
        return (Math.abs(a - b) <= EPS);
    }

    public static boolean equals(double a, double b, double error) {
        return (Math.abs(a - b) <= error);
    }
}
