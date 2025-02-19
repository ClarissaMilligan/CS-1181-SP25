import javax.swing.*;

public class GUIPractice
{
    public static void main(String[] args) throws InvalidSizeException
    {
        JFrame mainWindow = new MainWindow("Hello Window!");
        mainWindow.setSize(500, 500);
        mainWindow.setLocation(250, 250);

        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        System.out.println("All done!");
    }
}
