public class InvalidSizeException extends Exception
{
    public InvalidSizeException()
    {
        super("Invalid size for clothing item. Must be: 's', 'm', or 'l'");
    }
}
