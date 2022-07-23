package Exception;

public class MoveEmptyException extends Exception{
    public MoveEmptyException()
    {
        super("You cannot undo when move is not made");
    }
}
