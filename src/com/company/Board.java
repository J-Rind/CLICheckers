package com.company;

import java.util.ArrayList;

public class Board {
    Square[][] squares = new Square[8][8];
    ArrayList<Piece> redPieces = new ArrayList<>();
    ArrayList<Piece> whitePieces = new ArrayList<>();

    public Board(){
        this.setBoard();
    }

    public void setBoard(){
        //we need an 8x8 grid of squares
        for(int x =0; x<8;x++){
            for(int y = 0; y<8;y++){
                squares[x][y] = new Square();
            }
        }

        for(int x = 0 ; x < 8; x++){
            switch (x){
                case 0:
                    setOdds(x,redPieces,"R");
                    break;
                case 1:
                    setEven(x,redPieces,"R");
                    break;
                case 2:
                    setOdds(x,redPieces,"R");
                    break;
                case 3:
                    setBlanks(x);
                    break;
                case 4:
                    setBlanks(x);
                    break;
                case 5:
                    setEven(x,whitePieces,"W");
                    break;
                case 6:
                    setOdds(x,whitePieces,"W");
                    break;

                case 7:
                    setEven(x,whitePieces,"W");
                    break;

            }
        }
    }

    public void setEven(int row, ArrayList<Piece> pieces, String color){
        for(int y = 0;y<8;y++){
            if(y%2==0){
                Piece thisPiece = new Piece();
                setPieceOnSquare(thisPiece,row,y);
                thisPiece.setName("__" + color + row + "-" + y + "_");
                pieces.add(thisPiece);
            }else{
                Piece emptyPiece = new Piece();
                setPieceOnSquare(emptyPiece,row,y);
                emptyPiece.setName("__" + row + "-"+ y + "__");
            }
        }
    }

    public void setOdds(int row, ArrayList<Piece> pieces, String color){
        for(int y = 0;y<8;y++){
            if(y%2!=0){
                Piece thisPiece = new Piece();
                setPieceOnSquare(thisPiece,row,y);
                thisPiece.setName("__" + color + row + "-" + y + "_");
                pieces.add(thisPiece);
            }else{
                Piece emptyPiece = new Piece();
                setPieceOnSquare(emptyPiece,row,y);
                emptyPiece.setName("__" + row + "-"+ y + "__");
            }
        }
    }

    public void setBlanks(int row){
        for(int y = 0; y<8;y++){
            Piece emptyPiece = new Piece();
            setPieceOnSquare(emptyPiece,row,y);
            emptyPiece.setName("__" + row + "-"+ y + "__");
        }
    }


    public void setPieceOnSquare(Piece piece, int x, int y){
        squares[x][y].setPiece(piece);
    }

    public void removePieceOnSpace(int x, int y){
        Piece emptyPiece = new Piece();
        emptyPiece.setName("__"+x+"-"+y+"__");
        squares[x][y].setPiece(emptyPiece);
    }

    public void showBoard(){
        for(int x= 0; x<8;x++){
            for(int y = 0; y<8; y++){
                System.out.print(squares[x][y].getPiece().getName());
            }
            System.out.println();
        }

    }

    public ArrayList<Piece> getPieces(){
        ArrayList<Piece> tempList = new ArrayList<>();
        for(int x= 0; x<8;x++){
            for(int y = 0; y<8; y++){
                tempList.add(squares[x][y].getPiece());
            }

        }
        return tempList;
    }
}

