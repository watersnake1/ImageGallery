import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cmurray17 on 3/4/16.
 */
public class PicLoader implements Globals {

    String path = "../";
    /**
     * Gets all the files in a directory and returns them as an arraylist
     * @param dir target directory
     * @return files arraylist of the directory's contents
     */
    public ArrayList<File> getDirFiles(File dir)
    {
        ArrayList<File> files = new ArrayList<File>(Arrays.asList(dir.listFiles()));
        return files;
    }

    /**
     * Create a file object out of a directory path. If the path does not exist it will be created
     * @param path to the specified directory
     * @return
     */
    public File loadDir(String path)
    {

        File dir = new File(path);
        boolean result = false;
        try
        {
            if (!dir.exists())
            {
                dir.createNewFile();
            }
            if (dir.isDirectory())
            {
                result = true;
            }
            else
            {
                result = false;
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return dir;
    }

    /**
     * Create a list of file names from the array list of the directory contents
     * @return
     */
    public ArrayList<String> createTextFileList()
    {
        ArrayList<File> temp = getDirFiles(loadDir(path));
        ArrayList<String> fileNames = new ArrayList<String>();
        for (File f: temp)
        {
            if (!f.isDirectory())
            {
                fileNames.add(f.getName());
            }
        }
        return fileNames;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String newPath)
    {
        path = newPath;
    }
    /**
     * main method for testing only
     * @param args
     */
    public static void main(String[] args)
    {
        PicLoader p = new PicLoader();
        String path = args[0];
        System.out.println(p.getDirFiles(p.loadDir(path)));

    }
}
