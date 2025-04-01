public class CalculatorSec02
{
    public static int add(int one, int two) throws Exception
    {
        if (one == 1)
        {
            throw new Exception();
        }
        return one + two;
    }
}
