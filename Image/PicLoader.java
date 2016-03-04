import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cmurray17 on 3/4/16.
 */
public class PicLoader {
    ArrayList<File> files;

    public ArrayList<File> getDirFiles(File dir)
    {
        files = new ArrayList<File>(Arrays.asList(dir.listFiles()));
        return files;
    }
}
