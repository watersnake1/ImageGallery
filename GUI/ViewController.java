import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;

/**
 * Created by cmurray17 on 3/4/16.
 */
public class ViewController {
    private JPanel panel1;
    private JPanel panel2;
    private JTabbedPane tabbedPane1;
    private JFrame frame;
    private JLabel emptyImages;
    private JLabel settings;

    private ViewController()
    {
        panel1 = new JPanel();
        panel2 = new JPanel();
        tabbedPane1 = new JTabbedPane();
        frame = new JFrame();
        emptyImages = new JLabel("Image Library");
        settings = new JLabel("Settings");
    }

    private void createAndShowGUI()
    {
        frame.add(tabbedPane1);
        tabbedPane1.setVisible(true);
        tabbedPane1.addTab("Images", panel1);
        tabbedPane1.addTab("Settings", panel2);

        panel1.setLayout(new GridBagLayout());
        panel1.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(emptyImages);

        panel2.setLayout(new GridBagLayout());
        panel2.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(settings);

        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(750, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    public static void main(String[] args)
    {
        ViewController window = new ViewController();
        window.createAndShowGUI();
    }
}
