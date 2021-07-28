package Application;

import Chess.ChessPiece;

/**
 *
 * @author arils
 */
public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        
        System.out.println("   A  B  C  D  E  F  G  H");
        System.out.println(" ==========================");
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + "|");

            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.print("|" + (8 - i));
            System.out.println();
        }
        System.out.println(" ==========================");
        System.out.println("   A  B  C  D  E  F  G  H");
    }

    //Imprimir uma peça
    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print(" #");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }
}
