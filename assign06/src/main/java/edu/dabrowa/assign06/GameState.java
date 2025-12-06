package edu.dabrowa.assign06;

import edu.dabrowa.assign04.GameBoard;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GameState implements Loadable{
    private GameBoard map=new GameBoard(12,30,'.');
    private ArrayList<Object> things= new ArrayList<Object>();

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
            throw new GameFileException("Unknown type: "+typeName);
        }
    }

    public void load(Scanner input) throws GameFileException{
        map.clear();
        things.clear();
        String typeName="";
        Loadable m;
        int numLines=input.nextInt();
        for(int i=0;i<numLines;i++){
            typeName=input.next();
            m = createLoadable(typeName);
            m.load(input);
            things.add(m);
            if(things.get(i) instanceof Creature c)
                c.draw(map);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("MAP:\n");
        sb.append(map.getBoardString() + "\n");
        sb.append("CREATURES:\n");
        for(int i=0;i<things.size();i++){
            if(things.get(i) instanceof Creature c)
                sb.append("* "+c+"\n");
        }
        sb.append("INVENTORY:\n");
        for(int i=0;i<things.size();i++){
            if(things.get(i) instanceof Item c)
                sb.append("* "+c+"\n");
        }
        return sb.toString();
    }

    public void save(String filename) throws GameFileException{
        try {
            PrintWriter writer = new PrintWriter(filename);
            writer.print(this.toString());
            writer.close();
        } catch (Exception e) {
            throw new GameFileException("Failed to save file!",e);
        }
    }



}
