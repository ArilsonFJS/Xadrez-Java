package Application;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author arils
 */
public class Program {

    public static void main(String[] args) {
        /*ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());*/

        Scanner scn = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(scn);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(scn);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }
    }
}