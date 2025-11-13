package edu.dabrowa.assign05;

public class Troll extends Giant{

    public Troll(String n){
        super(n);
    }

    public String toString(){
        return "Troll "+super.toString();
    }

    public String cook(){
        return "Mutton again...";
    }
}
