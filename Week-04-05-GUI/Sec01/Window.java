import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame
{
    private int countClicks = 0;
    private JPanel contentPane = new JPanel();
    private JLabel lab = new JLabel();
    private JButton one = new JButton("one");
    private JButton two = new JButton("two");
    private JButton three = new JButton("three");
    private JButton slow = new JButton("slow count");
    private Shape draw = new Shape(300, 300);
    private JComboBox dropdown = new JComboBox();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu = new JMenu("My menu", true);
    private JMenuItem menuitem1 = new JMenuItem("Edit");

    public Window(String title)
    {
        super(title);
        this.setSize(500, 500);
        this.setLocation(0, 100);
        this.setContentPane(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        countClicks = 0;
        lab.setText("Hello, I'm a label!");
        lab.setFont(new Font("Comic Sans MS", 0, 50));
        customLayout();
        //gridLayout();
        //boxLayout();
        //borderLayout();
        //flowLayout();

        class InnerButtonListen implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("I was pressed!");
                lab.setFont(new Font("Comic Sans MS", 0, 50));
            }
        }
        one.addActionListener(new InnerButtonListen());

        two.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("I was pressed!");
                lab.setFont(new Font("Comic Sans MS", 1, 30));
            }
        });

        three.addActionListener(e ->
        {
            System.out.println("I was pressed!");
            lab.setFont(new Font("Comic Sans MS", 2, 70));
        });

        slow.addActionListener(e -> {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println("Counting: " + i);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        dropdown.addActionListener(e -> {
            if (dropdown.getSelectedItem().equals("option A"))
            {
                System.out.println("Hello");
            }
            else if (dropdown.getSelectedItem().equals("abc"))
            {
                System.out.println("yay");
            }
        });

        menuitem1.addActionListener(e -> {
            System.out.println("you clicked this option!");
        });

//        JButton buttonOne = new JButton("Click me!");
//        JButton buttonTwo = new JButton("No! Click ME!");
//
//        buttonOne.setPreferredSize(new Dimension(30, 30));
//
//        contentPane.add(buttonOne);
//        contentPane.add(buttonTwo);

        this.setVisible(true);
    }

    private void flowLayout()
    {
        for (int i = 0; i < 10; i++)
        {
            this.contentPane.add(new JButton("Button #" + i));
        }
    }

    private void borderLayout()
    {
        this.contentPane.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();

        northPanel.add(new JButton("FILE"));
        northPanel.add(new JButton("EDIT"));

        this.contentPane.add(northPanel, BorderLayout.NORTH);
        this.contentPane.add(new JButton("MIDDLE"), BorderLayout.CENTER);

    }

    private void boxLayout()
    {
        this.contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        for (int i = 0; i < 23; i++)
        {
            this.add(new JButton("#" + i));
        }
    }

    private void gridLayout()
    {
        this.contentPane.setLayout(new GridLayout(2, 5));

        for (int i = 0; i < 10; i++)
        {
            this.contentPane.add(new JButton("#" + i));
        }
    }

    private void customLayout()
    {
        this.contentPane.setLayout(new BorderLayout());

        JPanel bottom = new JPanel();
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
        bottom.add(one);
        bottom.add(two);
        bottom.add(three);
        bottom.add(slow);

        menuBar.add(menu);
        menu.add(menuitem1);
        menu.add(new JMenuItem("Save"));
        menu.add(new JMenuItem("Undo"));
        menu.add(new JMenuItem("Redo"));
        bottom.add(menuBar);

        this.contentPane.add(bottom, BorderLayout.SOUTH);

        JPanel twoButtons = new JPanel();
        twoButtons.setLayout(new BoxLayout(twoButtons, BoxLayout.X_AXIS));
        twoButtons.add(new JButton("LEFT"));
        twoButtons.add(new JButton("RIGHT"));

        dropdown.addItem("option A");
        dropdown.addItem("option B");
        dropdown.addItem("option C");
        dropdown.setEditable(true);
        twoButtons.add(dropdown);

        JPanel middle = new JPanel();
        //middle.setLayout(new BoxLayout(middle, BoxLayout.Y_AXIS));
        middle.add(new JButton("HI"));
        middle.add(twoButtons);
        middle.add(lab);
        middle.add(draw);
        this.contentPane.add(middle, BorderLayout.CENTER);
    }
}
