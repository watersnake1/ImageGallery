import javax.swing.*;
import javax.swing.text.View;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by cmurray17 on 3/4/16.
 */
public class ViewController implements Globals {

    public JPanel getPanel1(){return panel1;}

    public JPanel getPanel2(){return  panel2;}

    public JTabbedPane getTabbedPane1(){return tabbedPane1;}

    public JFrame getFrame(){return frame;}

    public JLabel getEmptyImages(){return emptyImages;}

    public JLabel getSettings(){return settings;}

    public JPanel getOverPanel(){return overpanel;}

    /**
     * Create all the GUI components of the main window
     */
    private void createAndShowGUI()
    {
        frame.add(menuBar);
        frame.add(tabbedPane1);
        tabbedPane1.setVisible(true);
        tabbedPane1.add(new JScrollPane(panel1, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER), "Images");
        tabbedPane1.add(new JScrollPane(panel2), "Settings");
        //tabbedPane1.addTab("Images", panel1);
        //tabbedPane1.addTab("Settings", panel2);

        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(BorderFactory.createEmptyBorder());
        //panel1.add(menuBar);
        //panel1.add(emptyImages);

        panel2.setLayout(new GridBagLayout());
        panel2.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(settings);
        panel2.add(settingsIcon);

        menuBar.add(fileMenu);
        fileMenu.setPreferredSize(new Dimension(75, 35));
        fileMenu.add(changeDir);

        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Files");


        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(750, 500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }

    /**
     * add the list of jlabels to the window
     * @param fileNames
     */
    public void createGUIFileList(ArrayList<String> fileNames)
    {
        ImageIcon icon = new ImageIcon("/Icons/pic_icon.png");
        for (String s: fileNames)
        {
            panel1.add(new JLabel(s + " ", icon, JLabel.LEFT));
        }
    }

    public ViewController getWindow()
    {
        return window;
    }

    public void main()
    {
        window.createAndShowGUI();
    }
}
