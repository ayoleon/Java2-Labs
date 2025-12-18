import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class InventoryFiles {
    private File folder;
    private File file;
    String[] MovieArray = new String[16];
    int movieindex = 0;
    Inventory inv;
    DecimalFormat df = new DecimalFormat("$000.00");


    void CreateFile() throws IOException {
        // Create a File object representing a folder
        System.out.println("\nLAB PART 1");
        folder = new File("C:\\Temp");


        if (!folder.exists()){
            boolean folderCreated = folder.mkdir(); //creates the folder if it doesn't exist
            if (folderCreated){
                System.out.println("Temp folder created in C drive: " + folder.getAbsolutePath());
            } else {
                System.out.println("Failed to create folder.");
                //return;
            }

        } else {
            System.out.println("Temp folder already exists. Movie files are saved in " + folder.getAbsolutePath());
        }

        file = new File(folder,"Movies.txt");
        if (file.createNewFile()){
            System.out.println("Movies.txt file created: " + file.getAbsolutePath());
        } else{
            System.out.println("Movies.txt File already exists: " + file.getAbsolutePath());
        }

    }

    void WritetoFile() throws IOException {
        FileWriter writer = new FileWriter(file);
        //.write overwrites, append adds...
        writer.write("Jaws,Spielberg,1975,29.50\n");
        writer.write("Wicked,Chu,2024,29.50\n");
        writer.write("Wicked For Good,Chu,2025,29.50\n");
        writer.write("Frankenstein,Toro,2025,29.50\n");
        writer.close();
        System.out.println("Write to File complete. File closed and saved.");
    }

    void ReadFile() throws FileNotFoundException {
        System.out.println("\nLAB PART 2");
        //File file = new File(file); FILE ALREADY CREATED
        Scanner read = new Scanner(file);
        System.out.println("READING FILE...");
        while (read.hasNextLine()) {
            String line = read.nextLine();
            System.out.println(line);
        }
        read.close();

        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(","); //delimitater

            for (int i = 0; i < parts.length; i++) {
                MovieArray[movieindex] = parts[i];
                movieindex++;
            }
        }

        System.out.println("\nLAB PART 3\nMovieArray Contents...");
        for(int i = 0; i< MovieArray.length; i++ ){
            System.out.print(MovieArray[i]+",");
        }

        double totalCost = 0;
        // prices are every 4th element- index 3, 7, 11, 15
        for (int i = 3; i < MovieArray.length; i += 4) {
            double price = Double.parseDouble(MovieArray[i]);
            totalCost += price * 10;
        }

        System.out.println("\n\nTotal cost to restock 10 copies of each movie = " + df.format(totalCost));

    }

    void CopytoArrayList() throws FileNotFoundException {
        inv = new Inventory(file);
        System.out.println("\nMovie ArrayList Contents...");
        for (Movie m : inv.MovieList){
            System.out.println(m.getTitle() + ", " + m.getDirector() + ", " + m.getYear() + ", " + m.getPrice());
        }
    }

    void invRestock(){
        System.out.print("\nInventory Class Restock Method: " + df.format(inv.restock()) + " to restock 10 copies of each movie.");

    }

    public static void main(String[] args) throws IOException {
        InventoryFiles infile = new InventoryFiles();
        infile.CreateFile();
        infile.WritetoFile();
        infile.ReadFile();
        infile.CopytoArrayList();
        infile.invRestock();
    }
}

class Movie{
    String mtitle;
    String mdirector;
    int myear;
    double mprice;

    Movie(String mtitle, String mdirector, int myear, double mprice){
        this.mtitle= mtitle;
        this.mdirector = mdirector;
        this.myear = myear;
        this.mprice = mprice;
    }

    public String getTitle() { return mtitle; }
    public String getDirector() { return mdirector; }
    public int getYear() { return myear; }
    public double getPrice() { return mprice; }
}

class Inventory{
    ArrayList<Movie> MovieList;
    File filename;

    Inventory(File filename) throws FileNotFoundException {
        this.filename = filename;
        MovieList= new ArrayList<>();

        Scanner reader = new Scanner(filename);

        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] parts = line.split(",");

            String title = parts[0];
            String director = parts[1];
            int year = Integer.parseInt(parts[2]);
            double price = Double.parseDouble(parts[3]);

            MovieList.add(new Movie(title,director,year, price));
        }
        reader.close();
        System.out.println("\n\nLAB PART 4");
        System.out.println("Movies added to array list.");
    }

    double restock(){
        double total = 0;

        for (Movie m : MovieList){
            total += m.getPrice() * 10;
        }

        return total;
    }
}