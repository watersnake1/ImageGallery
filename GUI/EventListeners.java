import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Carol on 3/6/16. This class is being weird it wont recognize any directory
 */
public class EventListeners implements Globals
{
    public void ButtonClickEvents()
    {
        changeDir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String path = JOptionPane.showInputDialog("enter the new directory path");
                File newPath = new File(path);
                while (!newPath.isDirectory())
                {
                    JOptionPane.showMessageDialog(panel1, path + " is not a directory");
                    path = JOptionPane.showInputDialog("enter the new directory path");
                }
                loader.setPath(path);
                window.createGUIFileList(loader.createTextFileList());
                panel1.updateUI();
            }
        });
    }
}
