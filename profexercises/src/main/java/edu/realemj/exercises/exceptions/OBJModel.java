package edu.realemj.exercises.exceptions;

import java.util.*;
import java.io.*;
import edu.realemj.exercises.math.Matrix;

public class OBJModel {
    private ArrayList<Matrix> vertices = new ArrayList<>();
    private ArrayList<Integer> indices = new ArrayList<>();

    void load(String filename) throws OBJFileException {
        try (
                Scanner fileInput = new Scanner(new File(filename));
                ) {
            vertices.clear();
            indices.clear();
            while(fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                line = line.trim();
                if(!line.isEmpty()) {
                    Scanner lineParse = new Scanner(line);
                    String token = lineParse.next();
                    switch(token) {
                        case "v" -> {
                            double x = lineParse.nextDouble();
                            double y = lineParse.nextDouble();
                            double z = lineParse.nextDouble();
                            Matrix v = Matrix.make3DPoint(x,y,z);
                            vertices.add(v);
                        }
                        case "f" -> {
                            int i0 = lineParse.nextInt();
                            int i1 = lineParse.nextInt();
                            int i2 = lineParse.nextInt();
                            indices.add(i0);
                            indices.add(i1);
                            indices.add(i2);
                        }
                        default -> {}
                    }
                }
            }
        }
        catch(Exception e) {
            vertices.clear();
            indices.clear();
            throw new OBJFileException("Error loading OBJ file: " + filename, e);
        }
    }

    public static String getVertexString(Matrix v) {
        return "v " + v.get(0,0)
                + " " + v.get(1, 0)
                + " " + v.get(2,0);
    }

    public static String getFaceString(int i0, int i1, int i2) {
        return "f " + i0 + " " + i1 + " " + i2;
    }

    public void save(String filename) throws OBJFileException {
        try (
                PrintWriter fileOutput = new PrintWriter(filename);
                ) {
            for(Matrix v: vertices) {
                fileOutput.println(getVertexString(v));
            }

            for(int i = 0; i < indices.size(); i += 3) {
                fileOutput.println(getFaceString(
                        indices.get(i),
                        indices.get(i+1),
                        indices.get(i+2)
                ));
            }
        }
        catch(Exception e) {
            throw new OBJFileException("Cannot save filename: " + filename, e);
        }
    }

    public void applyTransform(Matrix t) {
        for(int i = 0; i < vertices.size(); i++) {
            Matrix v = vertices.get(i);
            v = t.multiply(v);
            vertices.set(i, v);
        }
    }
}
