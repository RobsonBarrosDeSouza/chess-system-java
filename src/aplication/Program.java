package aplication;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		

		ChessMatch che = new ChessMatch();
		
		UI.printBoard(che.getPieces());

	}

}
