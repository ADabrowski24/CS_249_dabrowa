package edu.dabrowa.assign06;

import edu.dabrowa.assign04.GameBoard;

import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable{
    private GameBoard map=new GameBoard(12,30,'.');
    private ArrayList<Object> items= new ArrayList<Object>();

    public Loadable createLoadable(String typeName) throws GameFileException{
        if(typeName.equals("Skeleton"))
            return new Skeleton();
        else if(typeName.equals("Rat"))
            return new Rat();
        else if(typeName.equals("Item"))
            return new Item();
        else if(typeName.equals("Tome"))
            return new Tome();
        else{
            throw new GameFileException("unknown type"+typeName);
        }
    }

    public void load(Scanner input) throws GameFileException{
        map.clear();
        items.clear();
        int numLines=0;
        while (input.hasNextLine()) {
            input.nextLine();
            numLines++;
        }


    }



}
