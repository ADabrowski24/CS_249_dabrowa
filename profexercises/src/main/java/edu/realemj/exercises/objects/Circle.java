package edu.realemj.exercises.objects;

import edu.realemj.exercises.math.Matrix;

public class Circle {
    private double radius = 1.0;
    private Matrix pos = Matrix.make2DPoint(0,0);

    public Circle() {}

    public Circle(double r) {
        //radius = r;
        setRadius(r);
    }

    public Circle(double r, Matrix p) {
        setRadius(r);
        setPos(p);
    }

    public String toString() {
        return "Circle (radius = "
                + String.format("%.4f", radius)
                + ", center = "
                + pos.toPointString() + ")";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public Matrix getPos() {
        return new Matrix(pos);
    }

    public void setRadius(double radius) {
        if(checkValidRadius(radius)) {
            this.radius = radius;
        }
    }

    public void setPos(Matrix p) {
        pos = new Matrix(p);
    }

    public static boolean checkValidRadius(double r) {
        return (r >= 0);
    }

    public boolean equals(Object other) {
        if(other instanceof Circle co) {
            double diff = Math.abs(this.radius - co.radius);
            return (diff <= 1e-6);
        }
        return false;
    }
}
/*
class AuxExtraCircleClass {

}
*/