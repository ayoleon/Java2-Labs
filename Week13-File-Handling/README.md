# Final Lab – File Creation, Delimiters, Arrays, and ArrayLists

## Description
This lab demonstrates the lifecycle of working with files in Java, including
**creating files, writing structured data, reading and parsing that data, and storing it
into arrays and ArrayLists**. The program reinforces how **delimiters** are used to separate
data values within a file and how those values can be converted into usable objects.

The lab is divided into four parts, each building on the previous one to show how file
data can be processed and reused in different data structures.

## Objectives
- Understand how files store raw data
- Create and write data to a file using `FileWriter`
- Read data from a file using `File` and `Scanner`
- Use **delimiters** to separate values within a file
- Store file data into **arrays** and **ArrayLists**
- Convert file data into objects using constructors
- Perform calculations using **parsed file data**

## Concepts Practiced
- File and directory creation
- `FileWriter` for writing data to files
- `Scanner` for reading files
- **Comma-delimited data**
- String parsing using `split()`
- **Arrays** and **ArrayLists**
- Object-oriented design with classes and constructors
- **Data type parsing** (String, int, double)
- Inventory-style data processing

## Lab Structure Overview
The lab is divided into four parts:

Part 1 – Creating the file  
Part 2 – Reading the file  
Part 3 – File to array  
Part 4 – File to ArrayList

Each part demonstrates a different way of handling and organizing file data.

## Part 1 – Creating the File
- Creates a folder named `C:\Temp` if it does not already exist
- Creates a file named `Movies.txt` inside the folder
- Writes four fields per record using a comma delimiter:
  - Movie title
  - Director
  - Release year
  - Purchase cost
- Four movie records are written to the file using FileWriter

## Part 2 – Reading the File
- Uses the `File` class and `Scanner` to read the contents of `Movies.txt`
- Reads each line as a `String`
- Displays the raw file contents to the console

## Part 3 – File to Array
- Uses the `split()` method with a **comma delimiter**
- Stores parsed values into an array named `MovieArray`
- Correctly parses data into appropriate types
- Calculates the total cost to restock 10 copies of each movie
- Displays the computed total using formatted output

## Part 4 – File to ArrayList
- Creates a `Movie` class to represent individual movie records
- Uses constructors to store movie data in objects
- Creates an `Inventory` class containing an `ArrayList<Movie>` named `MovieList`
- Reads the file and converts each record into a `Movie` object
- Adds each `Movie` object to the ArrayList
- Calculates the restock cost using object data from the ArrayList

## Files Included
- `InventoryFiles.java` – Main driver class controlling lab execution
- **Movie** – Class representing individual movie records
- **Inventory** – Class managing the ArrayList of Movie objects

## How the Program Works
1. The program creates the required folder and file.
2. Movie data is written to the file using **comma delimiters**.
3. The file is read and displayed line by line.
4. File data is split and stored into an array.
5. Inventory restock cost is calculated using array data.
6. File data is read again and converted into Movie objects.
7. Movie objects are stored in an ArrayList.
8. Inventory restock cost is recalculated using object-oriented methods.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure the program has permission to create C:\Temp.
3. Set `InventoryFiles` as the main class.
4. Run the program.

### Command Line
1. Navigate to the folder containing InventoryFiles.java.
2. Compile the program:
```bash
   javac InventoryFiles.java
```
3. Run the program:
```bash
   java InventoryFiles
```

## Sample Output
- Confirms folder and file creation
- Displays movie records from the file
- Prints array contents
- Displays total cost to restock 10 copies of each movie
- Displays Movie objects stored in the ArrayList
- Displays inventory restock total using object data

## Notes
- Delimiters are required so the computer knows where one value ends and another begins.
- Files store raw data and must be parsed before use.
- Arrays store fixed-size data, while ArrayLists allow dynamic storage.
- Converting file data into objects allows for more flexible and reusable programs.
