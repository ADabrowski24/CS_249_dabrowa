package edu.realemj.midterm;

public class Toilet {
    private double gpf = 3.7;

    public Toilet() {}
    public Toilet(double gpf) {
        this.gpf = gpf;
    }

    public double flush(int cnt) {
        return gpf*cnt;
    }

    public static double computeGallons(int iter, double gallons) {
        return iter*gallons;
    }
}
