import javax.swing.*;
import java.io.File;
//import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Created by Carol on 3/6/16.
 */
public interface Globals
{
    JPanel panel1 = new JPanel();
    JPanel overpanel = new JPanel();
    JPanel panel2 = new JPanel();
    JTabbedPane tabbedPane1 = new JTabbedPane();
    JFrame frame = new JFrame();
    JLabel emptyImages = new JLabel("Images");
    JLabel settings = new JLabel("Settings");
    JScrollPane scrollpane = new JScrollPane();
    JLabel settingsIcon = new JLabel(new ImageIcon("../Icons/settings.png"));
    ViewController window = new ViewController();
    PicLoader loader = new PicLoader();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem changeDir = new JMenuItem("Change Directory...");
}
