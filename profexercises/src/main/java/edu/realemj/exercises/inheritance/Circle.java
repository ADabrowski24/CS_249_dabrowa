package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.Matrix;
import edu.realemj.exercises.math.Utility;
import edu.realemj.exercises.exceptions.InvalidRadiusException;

public class Circle extends Shape implements Drawable {
    private double radius = 1.0;

    public Circle() {
        // super();
    }

    public Circle(double radius) throws InvalidRadiusException {
        // super();
        setRadius(radius);
    }

    public Circle(double radius, Matrix pos) throws InvalidRadiusException {
        this(radius, pos, false);
    }

    public Circle(double radius, Matrix pos, boolean filled)
        throws InvalidRadiusException {

        super(pos, filled);
        setRadius(radius);
    }

    public void draw() {
        System.out.println("c i r c l e");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if(radius >= 0.0) {
            this.radius = radius;
        }
        else {
            throw new InvalidRadiusException(
                    "Radius should not be negative: " + radius);
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
