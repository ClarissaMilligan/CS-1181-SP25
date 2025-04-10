public class CountNegativeThread extends Thread
{
    @Override
    public void run()
    {
        for (int i = -500; i <= 0; i++)
        {
            System.out.println("Negative Count: " + i);
        }
    }
}
