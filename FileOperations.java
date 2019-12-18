// Assignment on inputFile operations

package fileoperations;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class FileOperations 
{
    // Class attributes
    private final String filePath;
    private Scanner inputFile;
    
    // Constructor to initialize class attributes
    public FileOperations(String filePath)
    {
        this.filePath = filePath;
        inputFile = null;
    }
    
    // opnen file method
    public void openFile()
    {
        try
        {
            inputFile = new Scanner(new FileInputStream(filePath));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error - file was not found.");
            System.exit(0);
        }
    }
    
    // Read file and display its contents
    public void readFile()
    {
        String line;
        while(inputFile.hasNext())
        {
            line = inputFile.nextLine();
            System.out.println(line);
        }
    }
    
    // close file
    public void closeFile()
    {
        inputFile.close();
    }
}
