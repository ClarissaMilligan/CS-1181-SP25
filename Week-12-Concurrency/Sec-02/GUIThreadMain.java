import javax.swing.*;
import java.awt.*;

public class GUIThreadMain
{
    public static void main(String[] args)
    {
        JFrame mainWindow = new JFrame();
        JPanel mainPanel = new JPanel();
        mainWindow.setContentPane(mainPanel);

        Button b1 = new Button("Count up on main thread");
        b1.addActionListener(e -> {
            for (int i = 0; i < 10; i++)
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
        });

        CountButton cb1 = new CountButton("Count Down");

        cb1.addActionListener(e -> {
                Thread t1 = new Thread(cb1);
                t1.start();
        });

        mainPanel.add(b1);
        mainPanel.add(cb1);

        mainWindow.setSize(250, 100);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
