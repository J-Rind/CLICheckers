package com.company;

public class Square {
    Piece piece;
    //String piece;
    String color;
    int x;
    int y;

    /*public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }
*/
    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Square(){

    }

    public Square(Piece piece, String color, int x, int y) {
        this.piece = piece;
        this.color = color;
        this.x = x;
        this.y = y;
    }
}
