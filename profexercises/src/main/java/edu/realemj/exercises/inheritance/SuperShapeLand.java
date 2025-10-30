package edu.realemj.exercises.inheritance;

import edu.realemj.exercises.math.Matrix;

public class SuperShapeLand {
    public static void main(String [] args) {
        Shape s1 = new Shape(Matrix.make2DPoint(5,7), true);
        System.out.println(s1);
        Circle c1 = new Circle();
        System.out.println(c1.getPos().toPointString());

        Circle c2 = new Circle(9.2,
                                Matrix.make2DPoint(6,7),
                                true);

        Circle c3 = new Circle(7.1,
                                Matrix.make2DPoint(-3,2));

        System.out.println(c3);

        Square sq1 = new Square(7.0);

        printShape(s1);
        printShape(c2);
        printShape(sq1);
    }

    public static void printShape(Shape s) {
        System.out.println("BEHOLD!");
        System.out.println(s); // s.toString()
        System.out.println("Area = " + s.getArea());
        if(s instanceof Circle c) {
            System.out.println("Radius = " + c.getRadius());
            c.setRadius(5.6);
        }
    }
}
