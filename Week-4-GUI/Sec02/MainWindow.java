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
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        MyRect rectangle = new MyRect(100, 100);

        JLabel lab = new JLabel("Hi, I am a label!");
        lab.setFont(new Font("Arial", 0, 40));
        //lab.setPreferredSize(new Dimension(100, 100));
        JLabel lab2 = new JLabel("Option: ");

        JButton button = new JButton("I'm a button!");
        JButton buttonTwo = new JButton("I'm a better button!");
        JButton buttonThree = new JButton("I'm the best button!");
        JButton sleepButton = new JButton("I'm slow!");
        button.setPreferredSize(new Dimension(100, 100));

        ButtonGroup choices = new ButtonGroup();
        JRadioButton radio = new JRadioButton("I'm a radio button!");
        JRadioButton radio2 = new JRadioButton("I'm a better one!");
        JRadioButton radio3 = new JRadioButton("I'm the best!");
        choices.add(radio);
        choices.add(radio2);
        choices.add(radio3);

        JSlider slide = new JSlider(SwingConstants.VERTICAL, -50, 50, 10);
        slide.setMajorTickSpacing(10);
        slide.setPaintTicks(true);

        slide.addChangeListener(e -> {
            lab2.setText(String.valueOf(slide.getValue()));
        });

        class InnerButtonListener implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You Pressed the button!");
                lab.setFont(new Font("Comic Sans MS", 1, 30));
            }
        }
        buttonTwo.addActionListener(new InnerButtonListener());

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You Pressed the button!");
                lab.setFont(new Font("Arial", 1, 70));
            }
        });

        buttonThree.addActionListener(e -> {
            System.out.println("You Pressed the button!");
            lab.setFont(new Font("Times New Roman", 2, 100));
        });

        radio.addActionListener(e -> {
            lab2.setText("Option: One");
        });

        radio2.addActionListener(e -> {
            lab2.setText("Option: Two");
        });

        radio3.addActionListener(e -> {
            lab2.setText("Option: Three");
        });

        sleepButton.addActionListener(e -> {
            for (int i = 1; i <= 10; i++){
                System.out.println("Counting: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        //button.setSize(100,100);

        contentPane.add(lab);
        contentPane.add(button);
        contentPane.add(buttonTwo);
        contentPane.add(buttonThree);
        contentPane.add(sleepButton);
        contentPane.add(rectangle);
        contentPane.add(radio);
        contentPane.add(radio2);
        contentPane.add(radio3);
        contentPane.add(lab2);
        contentPane.add(slide);
    }
}
