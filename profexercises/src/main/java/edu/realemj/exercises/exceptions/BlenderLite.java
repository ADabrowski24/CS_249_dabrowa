package edu.realemj.exercises.exceptions;

import edu.realemj.exercises.math.Matrix;

public class BlenderLite {
    public static void main(String [] args) {
        try {
            OBJModel model = new OBJModel();
            model.load("bunny.obj");
            Matrix t = Matrix.make3DScale(1.0, 2.0, 1.0);
            Matrix r = Matrix.make3DRotateZ(45);
            //t = r.multiply(t);
            t = t.multiply(r);
            model.applyTransform(t);
            model.save("bunnyModified.obj");
        }
        catch(Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }

        System.out.println("DONE");
    }
}
