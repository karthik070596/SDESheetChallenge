package Exception;

public class MaxButtonExceededException extends Exception{
    public MaxButtonExceededException()
    {
        super("Player has buttons more than the specified limit");
    }
}
