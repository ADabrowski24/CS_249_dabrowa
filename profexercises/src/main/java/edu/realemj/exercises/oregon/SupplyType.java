package edu.realemj.exercises.oregon;

public enum SupplyType {
    FOOD("food"),
    BULLETS("bullets"),
    AXLES("axles");

    private String name;

    private SupplyType(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public static SupplyType getType(String n) {
        /*
        return switch(n) {
            case "food" -> FOOD;
            case "bullets" -> BULLETS;
            case "axles" -> AXLES;
            default -> null;
        };
         */

        SupplyType chosenType = null;
        for(SupplyType st : SupplyType.values()) {
            if(st.getName().equals(n)) {
                chosenType = st;
                break;
            }
        }

        return chosenType;
    }
}
