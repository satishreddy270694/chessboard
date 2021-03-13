package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
    	if ((xCoordinate + yCoordinate) % 2 == 0) {
    		pawn.setPieceColor(pieceColor.BLACK);
    		pieces[xCoordinate][yCoordinate] = pawn;
        } else {
        	pawn.setPieceColor(pieceColor.WHITE);
    		pieces[xCoordinate][yCoordinate] = pawn;
        }   
        
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
    	final int N = 7;
    	
        if (xCoordinate < 0 || yCoordinate < 0 || xCoordinate >= N || yCoordinate >= N) {
            return false;
        }
        return true;
    }
}
