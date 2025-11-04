package edu.dabrowa.assign03;

public class GreetingCard {

    private char bChar;
    private String[] message;
    private final int cardLen=50;

    public  GreetingCard(String [] lines, char boundaryChar) {
        bChar=boundaryChar;
        setLines(lines);

    }

    public char getBoundaryChar(){
        return bChar;
    }

    public String getLines(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<message.length;i++){
            sb.append(message[i]);
            sb.append("\n");
        }
        return sb.toString();

    }

    public void setBoundaryChar(char boundaryChar){
        bChar=boundaryChar;
    }

    public void setLines(String[] lines){
        message=new String[lines.length];
        for(int i=0;i<lines.length;i++){
            message[i]=lines[i];
        }
    }

    public String generateBoundaryLine(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<50;i++){
            sb.append(bChar);
        }
        sb.append("\n");
        return sb.toString();
    }

    public String generateCenteredLine(String text){
        int len=text.length();
        StringBuilder sb = new StringBuilder();

        if(len!=0) {
            int halfLen = (len-1) / 2 + 2;



            for (int i = 0; i < (cardLen / 2) - halfLen; i++)
                sb.append(bChar);
            if (len != 0) {
                sb.append(" ");
                sb.append(text);
                sb.append(" ");
            }
            halfLen-=len%2;
            for (int i = (cardLen / 2) + halfLen; i < 50; i++)
                sb.append(bChar);
            sb.append("\n");
        }
        else
            sb.append(generateBoundaryLine());
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        int mLen=message.length;
        int lines=0;
        int runs=0;
        while((mLen-=5)>-5) {
            lines=5;
            if(mLen<1)
                lines=(5+mLen);
            if(!sb.isEmpty())
                sb.append("\n");
            sb.append(generateBoundaryLine());
            sb.append(generateBoundaryLine());
            for(int i=0;i<lines;i++)
               sb.append(generateCenteredLine(message[runs+i]));
            for(int i=0;i<(5-lines)+2;i++)
                sb.append(generateBoundaryLine());
            runs+=lines;

        }
        return sb.toString();

    }
}
