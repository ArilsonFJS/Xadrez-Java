package BoardGame;

/**
 *
 * @author arils
 */
public class BoardException extends RuntimeException{
    private static final long seriaVersionUID = 1L;
    
    public BoardException(String msg){
        super(msg);
    }
}
