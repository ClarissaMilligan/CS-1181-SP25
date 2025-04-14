import javax.swing.*;

public class AlphabetButton extends JButton implements Runnable
{
    public AlphabetButton(String name)
    {
        super(name);
    }

    @Override
    public void run()
    {
        char letter = 'a';
        for (int i = 0; i < 26; i++)
        {
            System.out.println(letter);
            letter++;
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ex)
            {
                throw new RuntimeException(ex);
            }
        }
    }
}
