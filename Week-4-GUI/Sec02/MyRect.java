import javax.swing.*;
import java.awt.*;

public class MyRect extends JComponent
{
    public MyRect(int x, int y)
    {
        super();
        this.setPreferredSize(new Dimension(x, y));
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        //g.drawRect(300, 300, 300, 300);
        g.fillRect(0, 0, 300, 300);
    }
}
