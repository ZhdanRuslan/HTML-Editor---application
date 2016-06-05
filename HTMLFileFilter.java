package editor;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by Ruslan Zhdan on 14.05.2016.
 */
public class HTMLFileFilter extends FileFilter
{

    @Override
    public boolean accept(File f)
    {
        if (f.isDirectory())
        {
            return true;
        } else if (!f.isDirectory())
        {
            String fileName = f.getName().toLowerCase();
            return fileName.endsWith(".html") || fileName.endsWith(".htm");
        }
        return false;
    }

    @Override
    public String getDescription()
    {
        return "HTML и HTM файлы";
    }
}
