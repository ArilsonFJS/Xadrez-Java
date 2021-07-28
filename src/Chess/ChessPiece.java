package Chess;

import BoardGame.Board;
import BoardGame.Piece;

/**
 *
 * @author arils
 */

//Classe Peça de Xadrez
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
}
