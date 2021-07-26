package BoardGame;

/**
 *
 * @author arils
 */
public class Position {
    
    private int raw; //Linha
    private int column; //Coluna

    public Position(int raw, int column) {
        this.raw = raw;
        this.column = column;
    }

    public int getRaw() {
        return raw;
    }

    public void setRaw(int raw) {
        this.raw = raw;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return raw + ", " + column;
    }
}
