package edu.dabrowa.assign04;

public class GameBoard {
    private char fill;
    private int row, col;
    private char[][]board;

    public GameBoard(int rowCnt, int colCnt, char fillChar){
        row=rowCnt;
        col=colCnt;
        fill=fillChar;
        board= new char[row][col];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++)
                board[r][c]=fill;
        }
    }

    public void clear() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++)
                board[r][c] = fill;
        }
    }

    public int getRowCnt(){
        return row;
    }
    public int getColCnt(){
        return col;
    }

    public boolean isValidPosition(int row, int col){
        return (row<this.row && row>=0 && col<this.col && col>=0);
    }

    public char getPos(int row, int col){
        if(isValidPosition(row,col))
            return board[row][col];
        return ' ';
    }

    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row,col)) {
            board[row][col] = c;
            return true;
        }
        return false;
    }

    public String toString(){
        return(row+" x "+col+ " GameBoard (default: " +fill+ ")");
    }

    public String getBoardString(){
        StringBuilder sb = new StringBuilder();
        for(int r=0;r<row;r++) {
            for (int c = 0; c < col; c++)
                sb.append(board[r][c]);
            sb.append("\n");
        }
        return sb.toString();

    }
}

