package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.Matrix;
import edu.realemj.exercises.math.Utility;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos) {
        this(radius, pos, false);
    }

    public Circle(double radius, Matrix pos, boolean filled) {
        super(pos, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius >= 0.0) {
            this.radius = radius;
        }
    }

    @Override
    public String toString() {
        String s = "Circle (radius = " + radius + ")";
        s += " comes from ";
        s += super.toString();
        return s;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;

        if(other instanceof Circle cother) {
            if(Utility.equals(radius, cother.radius) &&
                super.equals(other)) {
                isEqual = true;
            }
        }

        return isEqual;
    }

}
