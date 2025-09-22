package edu.realemj.exercises.oregon;

public class Supplies {
    private int totalFood = 0;
    private int totalBullets = 0;
    private int totalAxles = 0;

    public int getTotalFood() {
        return totalFood;
    }

    public int getTotalBullets() {
        return totalBullets;
    }

    public int getTotalAxles() {
        return totalAxles;
    }

    public void setTotalFood(int food) {
        totalFood = food;
    }

    public void setTotalBullets(int bullets) {
        totalBullets = bullets;
    }

    public void setTotalAxles(int axles) {
        totalAxles = axles;
    }

    /*
    public boolean addFood(int moreFood) {
        boolean success = false;
        int possibleFood = totalFood + moreFood;
        if(possibleFood >= 0) {
            totalFood = possibleFood;
            success = true;
        }
        return success;
    }

    public boolean addBullets(int moreBullets) {
        boolean success = false;
        int possibleBullets = totalBullets + moreBullets;
        if(possibleBullets >= 0) {
            totalBullets = possibleBullets;
            success = true;
        }
        return success;
    }

    public boolean addAxles(int moreAxles) {
        boolean success = false;
        int possibleAxles = totalAxles + moreAxles;
        if(possibleAxles >= 0) {
            totalAxles = possibleAxles;
            success = true;
        }
        return success;
    }
     */

    public int get(SupplyType stype) {
        return switch(stype) {
            case FOOD -> getTotalFood();
            case BULLETS -> getTotalBullets();
            case AXLES -> getTotalAxles();
        };
    }

    public void set(SupplyType stype, int value) {
        switch(stype) {
            case FOOD -> setTotalFood(value);
            case BULLETS -> setTotalBullets(value);
            case AXLES -> setTotalAxles(value);
        }
    }

    public boolean add(SupplyType stype, int moreValue) {
        boolean success = false;
        int possibleTotal = get(stype) + moreValue;
        if(possibleTotal >= 0) {
            set(stype, possibleTotal);
            success = true;
        }
        return success;
    }





}
