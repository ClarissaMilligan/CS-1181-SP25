import javax.swing.*;
import java.awt.*;

public class AnimationPanel extends JPanel
{
    private int circleX = 0;
    private int circleY = 0;

    public AnimationPanel()
    {
        circleX = 0;
        circleY = 0;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.GREEN);
        g.fillOval(circleX,circleY, 300, 300);
    }

    public void animate()
    {
        while (true)
        {
            circleX += 1;

            invalidate();
            repaint();

            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException ie)
            {
                System.out.println("Error!");
            }
        }
    }
}
