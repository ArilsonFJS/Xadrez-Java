package Application;

import Chess.ChessMatch;

/**
 *
 * @author arils
 */
public class Program {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
