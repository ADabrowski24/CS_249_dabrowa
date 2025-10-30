package edu.realemj.exercises.objects;

import edu.realemj.exercises.math.Matrix;

import java.util.*;

public class ShapeLand {
    public static void main(String [] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);

        System.out.println("Area c1: " + c1.getArea());
        System.out.println("Area c2: " + c2.getArea());

        c1.setRadius(8.0);

        System.out.println("Area c1 NOW: " + c1.getArea());

        System.out.println("COUNT: " + Tribble.cnt);
        for(int i = 0; i < 6000; i++) {
            Tribble t = new Tribble();
        }
        System.out.println("COUNT NOW: " + Tribble.cnt);

        Scanner input = InputSingleton.getInstance().getScanner();

        InputSingleton single = InputSingleton.getInstance();
        Scanner input2 = single.getScanner();

        //InputSingleton mine = new InputSingleton();

        Matrix m = new Matrix(Matrix.make2DPoint(5,7));
        System.out.println(m);

        /*
        Circle c4 = new Circle(5.0);
        Circle c5 = new Circle(5.0);
        System.out.println("Equal? " + c4.equals(c5));

        switch(c4) {
            case null -> System.out.println("NULL");
            case new Circle(5.0) -> System.out.println("EQUAL");
            default -> System.out.println("NOT EQUAL");
        }
         */
    }
}
