package edu.dabrowa.assign05;
import java.util.ArrayList;

public class Woods {
    private ArrayList<Giant> Creatures = new ArrayList<Giant>();

    public Giant createGiant(String name, String typeName){
        if(name.length()==0)
            return null;
        if(typeName.equals("GIANT")){
            return new Giant(name);
        }
        else if(typeName.equals("TROLL")){
            return new Troll(name);
        }
        else if(typeName.equals("TREE")){
            return new Tree(name);
        }

        else if(typeName.equals("ENT")){
            return new Ent(name);
        }

        else if(typeName.equals("HUORN")){
            return new Huorn(name);
        }
        return null;
    }

    public boolean addGiant(String name, String typeName){
        Giant temp=createGiant(name,typeName);
        if(temp==null){
            return false;
        }
        Creatures.add(temp);
        return true;
    }

    public Giant getGiant(int index){
        if(index>=0 && index<Creatures.size())
            return Creatures.get(index);
        return null;
    }

    public void printAllGiants(){
        System.out.println("ALL GIANTS:");
        for(int i=0;i<Creatures.size();i++)
            System.out.println("- "+Creatures.get(i).toString());
    }

    public void printAllTrees(){
        System.out.println("ALL TREES:");
        for(int i=0;i<Creatures.size();i++){
            if(Creatures.get(i) instanceof Tree t){
                System.out.println("- "+t.toString()+": "+t.speak());

            }
        }
    }

    public void printAllTrolls(){
        System.out.println("ALL TROLLS:");
        for(int i=0;i<Creatures.size();i++){
            if(Creatures.get(i) instanceof Troll t){
                System.out.println("- "+t.toString()+": "+t.cook());
            }
        }
    }

}
