package BoardGame;

/**
 *
 * @author arils
 */
// Classe Peça
public abstract class Piece {

    protected Position position; //Posição
    private Board board; //Tabuleiro

    public Piece(Board board) {
        this.board = board;
        position = null; //Posição da peça recém criada será nula
    }

    //Somente classes do mesmo pacote e subclasses poderam acessar o Tabuleiro
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
