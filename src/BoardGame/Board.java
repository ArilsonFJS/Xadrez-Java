package BoardGame;

/**
 *
 * @author arils
 */
// Classe Tabuleiro
public class Board {

    private int rows; //Linhas
    private int columns; //Colunas
    private Piece[][] pieces; //Matriz de peças

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //Retorna a peça dada a linha e a coluna
    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    //Retorna a posicao da peça
    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    //Colocar uma peça dada a posição
    public void placePiece(Piece piece, Position position) {
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position; //peça não está mais na posição null e sim na posição passada por argumento
    }
}
