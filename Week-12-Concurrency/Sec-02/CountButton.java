import javax.swing.*;

public class CountButton extends JButton implements Runnable
{
    public CountButton (String text)
    {
        super(text);
    }

    @Override
    public void run()
    {
        this.setEnabled(false);
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ie)
            {
                System.out.println("oh no");
            }
        }
        this.setEnabled(true);
    }
}
