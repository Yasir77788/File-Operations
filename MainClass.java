// Assignment on inputFile operations

package fileoperations;
import java.util.Scanner;

public class MainClass 
{
    // main-method gets the user input
    // creates a FileOperations object,
    // invokes FileOperations methods
    public static void main(String[] args)
    {
        String filePath;
        
        // create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path to be read: ");
        filePath = input.nextLine();
        
        // Creat file object and pass the file path/name to the constructor
        FileOperations fileObj = new FileOperations(filePath);
        
        // performing operations on file:
        System.out.println("\nOpenning the file...");
        
        // Open the file
        fileObj.openFile();
        
        // read file and display its contents
        System.out.println("Reading the file and displaying its contents:");
        System.out.println("=============================================");
        fileObj.readFile();
        
        // close the file
        fileObj.closeFile();
    }
}
