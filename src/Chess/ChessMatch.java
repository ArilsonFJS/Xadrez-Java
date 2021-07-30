package Chess;

import BoardGame.Board;
import BoardGame.Piece;
import BoardGame.Position;
import Chess.pieces.King;
import Chess.pieces.Rook;

/**
 *
 * @author arils
 */
//Classe Partida de Xadrez
public class ChessMatch {

    //Turno
    private int turn; 
    //jogador atual
    private Color currentPlayer; 
    //Tabuleiro
    private Board board;

    //Quem tem que definir a dimensão de um tabuleiro é a partida de xadrez
    public ChessMatch() {
        board = new Board(8, 8);
        turn = 1;
        currentPlayer = Color.WHITE;
        initialSetup();
    }

    public int getTurn() {
        return turn;
    }

    public Color getCurrentPlayer() {
        return currentPlayer;
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
    
    public boolean[][] possibleMoves(ChessPosition SourcePosition){
        Position position = SourcePosition.toPosition();
        validateSourcePosition(position);
        return board.piece(position).possibleMoves();
    }
    
    //Executar movimento de xadrez
    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targertPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targertPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        Piece capturedPiece = makeMove(source, target);
        nextTurn();
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(Position source, Position targert) {
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(targert);
        board.placePiece(p, targert);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position) {
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("Nao existe peca na posicao de origem.");
        }
        if(currentPlayer != ((ChessPiece)board.piece(position)).getColor()){
            throw new ChessException("A peca escolhida nao e sua.");
        }
        if(!board.piece(position).isThereAnyPossibleMove()){
            throw new ChessException("Nao existe movimentos possiveis para a peca escolhida");
        }
    }

    private void validateTargetPosition(Position source, Position target){
        if(!board.piece(source).possibleMoves(target)){
            throw new ChessException("A peca escolhida nao pode se mover para a posicao de destino");
        }
    }
    
    //troca de turno
    public void nextTurn(){
        turn ++;
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    //Inicializador da partida colocando peças no tabuleiro
    private void initialSetup() {
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}
