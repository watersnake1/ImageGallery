import info.christian.Util.Globals.* ;
import info.christian.GUI.*;
import info.christian.Image.PicLoader;

import java.awt.*;

import static info.christian.Util.Globals.loader;
import static info.christian.Util.Globals.window;

/**
 * Created by cmurray17 on 3/22/16.
 */
public class start
{
    /**
     * Get all the neccesary objects ready to go
     */
    public void makeGallery()
    {
        window.main();
        window.setFrameIsResizable(false);
        window.setFramePreferredSize(new Dimension(750, 500));
        window.createGUIFileList(loader.createTextFileList());
        loader.setPath("/Users");
    }

    public void startListeners()
    {
        EventListeners e = new EventListeners();
        e.ButtonClickEvents();
    }

    /**
     * May not be the main method that is used in the final version but will do for now
     * @param args
     */
    public static void main(String[] args)
    {
        ObjInit o = new ObjInit();
        o.makeGallery();
        o.startListeners();
    }
}
