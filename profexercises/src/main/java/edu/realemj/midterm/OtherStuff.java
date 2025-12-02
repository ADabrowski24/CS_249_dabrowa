package edu.realemj.midterm;

public class OtherStuff {
    public static void main(String [] args) {
        // Init because of code itself
        int [] histogram = new int[10];
        String [] crew = {"Bob", "Joe", "Bill"};
        String message = "Beans";

        // Q44
        int [] dwarves = new int[7];

        // Q45
        for(int i = 0; i < histogram.length; i++) {
            histogram[i] = 5;
        }

        // Q46
        for(String sus: crew) {
            System.out.println(sus);
        }

        // Q47
        for(int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        // Q49
        Toilet privy = new Toilet(9.1);

        // Q50
        System.out.println(privy.flush(27));

        // Q51
        System.out.println(Toilet.computeGallons(30, 4.2));

    }
}
