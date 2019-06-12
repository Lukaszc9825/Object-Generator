import java.io.*;

public class SaveToTXT {

private FileWriter filewriter;
private File file;

    public SaveToTXT (){}

    public void makeFile (String name) throws Exception
    {
        try {
            File file = new File(name + ".txt");
            FileWriter filewriter = new FileWriter(file);
            this.file = file;
            this.filewriter = filewriter;
        }catch (Exception ex) {
            System.out.println("File access problem");
        }
    }

    public void saveLane (String lane) throws  Exception
    {
        try {
            filewriter.write(lane);
            filewriter.write("\n");
        }catch (IOException ex) {
            System.out.println("File access problem");
        }
    }

    public File getFile()
    {
            return file;
    }

    public FileWriter getFilewriter()
    {
           return filewriter;
    }
}

