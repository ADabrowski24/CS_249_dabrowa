package edu.realemj.exercises.introobj;

public class NPC {
    private int health = 100;
    private String name = "";

    public NPC() {}

    public NPC(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        if(h >= 0) {
            health = h;
        }
        else {
            health = 0;
        }
    }

    public String toString() {
        return "NPC: " + name + " (health: " + health + ")";
    }
}
