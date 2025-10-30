package edu.realemj.exercises.math;

public class Matrix {
    private double [][] m;

    public Matrix(Matrix other) {
        // GONNA CALL ANOTHER CONSTRUCTOR
        this(other.m);
        /*
        m = new double[other.getRowCnt()][other.getColCnt()];
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = other.m[i][j];
            }
        }*/
    }

    public Matrix(double [][] data) {
        //m = new double[data.length][data[0].length];
        this(data.length, data[0].length);
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = data[i][j];
            }
        }
    }

    public Matrix(int rowCnt, int colCnt) {
        m = new double[rowCnt][colCnt];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                sb.append(m[i][j]);
                sb.append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Matrix make2DPoint(double x, double y) {
        Matrix V = new Matrix(3,1);
        V.set(0,0,x);
        V.set(1,0,y);
        V.set(2,0,1);
        return V;
    }

    public static Matrix make3DPoint(double x, double y, double z) {
        return new Matrix(new double[][]{
                {x},
                {y},
                {z},
                {1}
        });
    }

    public static Matrix make2DTranslate(double xoff, double yoff) {
        return new Matrix(new double [][]{
                {1,0,xoff},
                {0,1,yoff},
                {0,0,1}
        });
    }

    public Matrix multiply(Matrix other) {
        // TODO: Error check that this.getColCnt() == other.getRownCnt()
        Matrix result = new Matrix(this.getRowCnt(), other.getColCnt());
        for(int i = 0; i < result.getRowCnt(); i++) {
            for(int j = 0; j < result.getColCnt(); j++) {
                for(int k = 0; k < this.getColCnt(); k++) {
                    double value = this.m[i][k]*other.m[k][j];
                    result.m[i][j] += value;
                }
            }
        }
        return result;
    }

    public String toPointString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for(int i = 0; i < (getRowCnt()-1); i++) {
            if(i != 0) {
                sb.append(",");
            }
            sb.append(m[i][0]);
        }
        sb.append(")");
        return sb.toString();
    }

    public int getRowCnt() {
        return m.length;
    }

    public int getColCnt() {
        return m[0].length;
    }

    public boolean isInBounds(int row, int col) {
        return (row < getRowCnt() &&
                col < getColCnt() &&
                row >= 0 &&
                col >= 0);
    }

    public double get(int row, int col) {
        if(isInBounds(row,col)) {
            return m[row][col];
        }
        else {
            System.err.println("WARNING: Out of bounds!");
            return 0;
        }
    }

    public void set(int row, int col, double val) {
        if(isInBounds(row,col)) {
            m[row][col] = val;
        }
        else {
            System.err.println("WARNING: Out of bounds!");
        }
    }

    @Override
    public boolean equals(Object other) {
        boolean isEqual = false;

        if(other instanceof Matrix mother) {
            if(mother.getRowCnt() == this.getRowCnt() &&
                mother.getColCnt() == this.getColCnt()) {

                boolean dataEqual = true;
                for(int r = 0; r < this.getRowCnt(); r++) {
                    for(int c = 0; c < this.getColCnt(); c++) {
                        if(!Utility.equals(m[r][c], mother.m[r][c])) {
                            dataEqual = false;
                            break;
                        }
                    }
                    if(!dataEqual) {
                        break;
                    }
                }

                isEqual = dataEqual;
            }
        }

        return isEqual;
    }
}
