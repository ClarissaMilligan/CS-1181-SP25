import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent
{
    public Shape(int width, int height)
    {
        super();
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawOval(0, 0, 300, 300);
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, 300, 300);

        g.setColor(Color.MAGENTA);
        //g.draw3DRect(100, 100, 100, 100, true);
        g.fill3DRect(100, 100, 100, 100, true);

        g.setColor(Color.RED);
        g.drawArc(0, 0, 125, 75, 66, 75);

    }
}
