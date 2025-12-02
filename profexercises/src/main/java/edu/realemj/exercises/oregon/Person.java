package edu.realemj.exercises.oregon;

public class Person implements Comparable<Person> {
    private String name;
    private boolean alive = true;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean a) {
        alive = a;
    }

    public void unalive() {
        alive = false;
    }

    public String toString() {
        String s = name;
        if(!alive) {
            s += " (deceased)";
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isSame = false;
        if(obj instanceof Person pother) {
            // NOTE: NOT comparing alive status
            if(name.equals(pother.name)) {
                isSame = true;
            }
        }

        return isSame;
    }

    public int compareTo(Person pother) {
        return this.name.compareTo(pother.name);
    }
}
