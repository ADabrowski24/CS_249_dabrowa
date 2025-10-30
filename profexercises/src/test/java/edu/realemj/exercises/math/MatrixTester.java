package edu.realemj.exercises.math;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatrixTester {
    @Test()
    public void testMatrixEquals() {
        Matrix m1 = Matrix.make2DPoint(5,6);
        Matrix m2 = Matrix.make2DPoint(5,6);
        Matrix m3 = Matrix.make2DPoint(6,7);

        Assert.assertEquals(m1, m2);
        Assert.assertNotEquals(m1, m3);
        Assert.assertNotEquals(m2, m3);
    }
}
