import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class SaveToTXT {

private PrintWriter save;
private File file;

    public SaveToTXT (){}

    public void makeFile (String name) throws FileNotFoundException
    {
        File file = new File(name + ".txt");
        PrintWriter save = new PrintWriter(file);
        this.file = file;
        this.save = save;
    }

    public void saveLane (File file,String lane) throws FileNotFoundException
    {
        save.println(lane);
        save.println();
    }

    public File getFile()
    {
        return file;
    }

    public PrintWriter getSave()
    {
        return save;
    }
}

