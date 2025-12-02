package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.*;

public abstract class Shape implements Drawable {
    private Matrix pos = Matrix.make2DPoint(0,0);
    protected boolean filled;

    protected Shape() {}

    protected Shape(Matrix pos) {
        setPos(pos);
    }

    protected Shape(Matrix pos, boolean filled) {
        setPos(pos);
        setFilled(filled);
    }

    public void setPos(Matrix pos) {
        this.pos = new Matrix(pos);
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Matrix getPos() {
        return new Matrix(this.pos);
    }

    public boolean isFilled() {
        return this.filled;
    }

    public String toString() {
        return "Shape (center = "
                + pos.toPointString() + ", "
                + "filled = " + filled
                + ")";
    }

    /*
    public double getArea() {
        return 0;
    }*/

    public abstract double getArea();

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;

        if(other instanceof Shape sother) {
            if(pos.equals(sother.pos) && filled == sother.filled) {
                isEqual = true;
            }
        }

        return isEqual;
    }
}
