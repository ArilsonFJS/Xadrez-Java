package Chess;

import BoardGame.Board;

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
}
