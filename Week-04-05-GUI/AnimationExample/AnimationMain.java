import javax.swing.*;

public class AnimationMain
{
    public static void main(String[] args)
    {
        JFrame mainWindow = new JFrame("Animation!!");

        mainWindow.setLocation(0,0);
        mainWindow.setSize(1000, 500);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnimationPanel aP = new AnimationPanel();
        mainWindow.setContentPane(aP);



        mainWindow.setVisible(true);

        aP.animate();
    }
}
