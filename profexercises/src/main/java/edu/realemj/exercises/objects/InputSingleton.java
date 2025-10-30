package edu.realemj.exercises.objects;

import java.util.*;

public class InputSingleton {
    // SINGLETON STUFF
    private static InputSingleton instance;

    public static InputSingleton getInstance() {
        if(instance == null) {
            instance = new InputSingleton();
        }
        return instance;
    }

    private InputSingleton() {

    }

    // NORMAL CLASS STUFF
    private Scanner input = new Scanner(System.in);

    public Scanner getScanner() {
        return input;
    }
}
