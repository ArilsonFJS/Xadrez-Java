package BoardGame;

/**
 *
 * @author arils
 */
// Classe Peça
public class Piece {

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
    
    
}
