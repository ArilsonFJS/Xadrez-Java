package BoardGame;

/**
 *
 * @author arils
 */
// Classe Tabuleiro
public class Board {

    private int rows; //Linhas
    private int columns; //Colunas
    private Piece[][] piece; //Matriz de peças

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        piece = new Piece[rows][columns];
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

}
