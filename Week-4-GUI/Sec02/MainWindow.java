import javax.swing.*;

public class MainWindow extends JFrame
{
    private int clickCount = 0;

    public MainWindow(String windowName)
    {
        super(windowName);
        clickCount = 0;

        JButton button = new JButton("I'm a button!");
        this.add(button);
    }
}
