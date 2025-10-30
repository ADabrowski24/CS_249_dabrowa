package edu.dabrowa.assign04;

public class Box {
    private int startr;
    private int startc;
    private int endr;
    private int endc;
    private boolean isFilled;
    private char drawnChar;

    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar){
        startr=sr;
        startc=sc;
        endr=er;
        endc=ec;
        isFilled=filled;
        drawnChar=drawChar;
    }

    public String toString(){
        if(isFilled)
            return "Filled Box from ("+startr+","+startc+") to ("+endr+","+endc+") with char '"+drawnChar+"'";
        return "Box from ("+startr+","+startc+") to ("+endr+","+endc+") with char '"+drawnChar+"'";
    }

    public void draw(GameBoard s){
        if(isFilled){
            for(int r=startr;r<=endr;r++){
                for(int c=startc;c<=endc;c++){
                    s.setPos(r,c,drawnChar);

                }
            }
        }
        else{
            for(int r=startr;r<=endr;r++) {
                s.setPos(r, startc, drawnChar);
                s.setPos(r, endc, drawnChar);
            }
            for(int c=startc;c<=endc;c++){
                s.setPos(startr, c, drawnChar);
                s.setPos(endr, c, drawnChar);
            }

        }
    }
}
