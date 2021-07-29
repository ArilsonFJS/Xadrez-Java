package Chess.pieces;

import BoardGame.Board;
import Chess.ChessPiece;
import Chess.Color;

/**
 *
 * @author arils
 */
//Classe Torre
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return " R";
    }

    @Override
    public boolean[][] possibleMoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
