package edu.realemj.exercises.math;

public class MathLand {
    public static void main(String [] args) {
        Matrix p1 = Matrix.make2DPoint(2,3);
        Matrix p2 = Matrix.make2DPoint(-5,7);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.toPointString());
        System.out.println(p2.toPointString());

        Matrix M = Matrix.make2DTranslate(6,-2);
        Matrix p3 = M.multiply(p1);
        Matrix p4 = M.multiply(p2);

        System.out.println(p3.toPointString());
        System.out.println(p4.toPointString());

    }
}
