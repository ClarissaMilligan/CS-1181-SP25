import javax.swing.*;
import java.awt.*;

public class AlphabetButtonGUI
{
    public static void main(String[] args)
    {
        JFrame mainWindow = new JFrame();
        JPanel root = new JPanel();
        mainWindow.setContentPane(root);

        AlphabetButton ab1 = new AlphabetButton("alphabet!");
        ab1.addActionListener( e -> {
            Thread t1 = new Thread(ab1);
            t1.start();
        });
        root.add(ab1);

        JLabel tf = new JLabel();
        tf.setText("Hello!");
        root.add(tf);

        JButton b1 = new JButton("change text");
        b1.addActionListener( e -> {
            tf.setFont(new Font("ComicSansMS", 0, 50));
        });
        root.add(b1);

        mainWindow.setSize(250, 250);
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }
}
