package Chess;

import BoardGame.Board;
import BoardGame.Position;
import Chess.pieces.King;
import Chess.pieces.Rook;

/**
 *
 * @author arils
 */
//Classe Partida de Xadrez
public class ChessMatch {

    private Board board;

    //Quem tem que definir a dimensão de um tabuleiro é a partida de xadrez
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    //Retorna a matriz de peças da partida de Xadrez.
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    //Inicializador da partida colocando peças no tabuleiro
    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
    }
}
