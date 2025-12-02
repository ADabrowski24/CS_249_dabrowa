package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.Utility;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {}

    public Square(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        String s = "Square (side = " + side + ")";
        s += " comes from ";
        s += super.toString();
        return s;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;

        if(other instanceof Square sqother) {
            if(Utility.equals(side, sqother.side) &&
                super.equals(other)) {

                isEqual = true;
            }
        }

        return isEqual;
    }

    public void draw() {
        System.out.println("Hip to be square");
    }
}
