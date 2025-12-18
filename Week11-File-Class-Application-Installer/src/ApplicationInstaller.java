import java.io.*;
import java.util.*;


public class ApplicationInstaller {
    private File folder;
    private File file;

    ApplicationInstaller() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name for the folder:");
        String foldname = input.nextLine();
        System.out.println("Enter a name for the file:");
        String filename = input.nextLine() + ".txt";
        CreateFolder(foldname);
        CreateFile(folder, filename);
        WriteFile(file);

    }

    void CreateFolder(String foldname){
        // Create a File object representing a folder
        folder = new File(foldname);

        if (!folder.exists()){
            boolean folderCreated = folder.mkdir(); //creates the folder if it doesn't exist
            if (folderCreated){
                System.out.println("Folder created:" + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to create folder.");
                //return;
            }

        } else {
            System.out.println("Folder already exists.");
        }

    }

    void CreateFile(File folder, String filename) throws IOException {
        file = new File(folder, filename);

        if (file.createNewFile()){
            System.out.println("File created: " + file.getAbsolutePath());
        } else{
            System.out.println("File already exists.");
        }
    }

    void WriteFile(File file) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write("App Installation Complete\n");
        writer.write("Folder Created Successfully\n");
        writer.write("Thank you for using this installer!");
        writer.close();
        System.out.println("Installation Finished!");
    }


    public static void main(String[] args) throws IOException {
        new ApplicationInstaller();
    }
}