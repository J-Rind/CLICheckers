package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Board myBoard = new Board();
	    myBoard.showBoard();


	    //=====================================
	    ArrayList<Piece> gamePieces = new ArrayList<>();
	    gamePieces = myBoard.getPieces();
        Piece x = new Piece();
        x = gamePieces.get(17);
	    myBoard.setPieceOnSquare(x, 3,0);
	    myBoard.removePieceOnSpace(2,1);
        System.out.println("==============================================================");
	    myBoard.showBoard();
        System.out.println("==============================================================");

        for(Piece p: gamePieces){
            System.out.println(p.getName());
        }

    }
}
