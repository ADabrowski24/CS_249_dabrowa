package edu.dabrowa.assign05;

public class Tree extends Giant{

    public Tree(String n){
        super(n);
    }

    public String toString(){
        return super.toString()+" of the trees";
    }

    public String speak(){
        return "<rustling>";
    }
}
