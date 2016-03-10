import java.awt.event.ActionListener;

import java.util.ArrayList;

/**
 * Created by Carol on 3/6/16.
 */
public class ObjInit implements Globals
{
    /**
     * Get all the neccesary objects ready to go
     */
    public void makeGallery()
    {
        window.main();
        window.createGUIFileList(loader.createTextFileList());
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
