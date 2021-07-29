package Chess;

import BoardGame.BoardException;

/**
 *
 * @author arils
 */
public class ChessException extends BoardException {
    private static final long serialVersioUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
