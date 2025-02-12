import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame
{
    private int clickCount = 0;

    public MainWindow(String windowName)
    {
        super(windowName);
        clickCount = 0;

        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        JLabel lab = new JLabel("Hi, I am a label!");
        lab.setFont(new Font("Arial", 0, 40));
        //lab.setPreferredSize(new Dimension(100, 100));

        JButton button = new JButton("I'm a button!");
        JButton buttonTwo = new JButton("I'm a better button!");
        button.setPreferredSize(new Dimension(100, 100));

        class InnerButtonListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You Pressed the button!");
                lab.setFont(new Font("Arial", 1, 30));
            }
        }

        buttonTwo.addActionListener(new InnerButtonListener());
        //button.setSize(100,100);

        contentPane.add(lab);
        contentPane.add(button);
        contentPane.add(buttonTwo);
    }
}
