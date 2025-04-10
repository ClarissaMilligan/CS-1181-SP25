public class LettersThread extends Thread
{
    public void run()
    {
        char letter = 65;
        for (int i = 65; i < 123; i++)
        {
            letter = (char) i;
            System.out.println("Letters Thread: " + letter);
        }
    }
}
