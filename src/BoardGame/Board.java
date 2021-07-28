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

        if (rows < 1 || columns < 1) {
            throw new BoardException("Erro ao criar tabuleiro: Necessário ao menos 1 linha e 1 coluna");
        }

        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    //Retorna a peça dada a linha e a coluna
    public Piece piece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Posição não existe no tabuleiro!");
        }
        return pieces[row][column];
    }

    //Retorna a posicao da peça
    public Piece piece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição não existe no tabuleiro!");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    //Colocar uma peça dada a posição
    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)){
            throw new BoardException("Já existe uma peça na posição " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position; //peça não está mais na posição null e sim na posição passada por argumento
    }

    //verifica se a posição existe 
    public boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    //Verifica se a peça existe
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Posição não existe no tabuleiro!");
        }
        return piece(position) != null;
    }
}
