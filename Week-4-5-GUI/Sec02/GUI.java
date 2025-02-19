import javax.swing.*;
import java.awt.*;

public class GUI
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        JPanel mainPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JPasswordField spins = new JPasswordField();
        JLabel lab = new JLabel();
        JButton bob;

        spins.setPreferredSize(new Dimension(100, 100));

        spins.addActionListener(e -> {
            char[] secret = spins.getPassword();
            System.out.println(secret);
            lab.setText(String.copyValueOf(secret));
        });

        int j = 1;
        for (int i = 1; i < 9; i++)
        {
            bob = new JButton("Button: " + i);
            bob.setPreferredSize(new Dimension(i*j, i*j));
            buttonPanel.add(bob);
            j *= 2;
        }

        mainPanel.add(buttonPanel);
        mainPanel.add(spins);
        mainPanel.add(lab);

        window.add(mainPanel);

        window.setSize(500, 500);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
