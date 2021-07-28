package BoardGame;

/**
 *
 * @author arils
 */
public class Position {
    
    private int row; //Linha
    private int column; //Coluna

    public Position(int raw, int column) {
        this.row = raw;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int raw) {
        this.row = raw;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}
