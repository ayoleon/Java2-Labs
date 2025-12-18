# Week 11 Lab – Application Installer Using the File Class

## Description
This lab focuses on using Java’s **File class to simulate a simple software installer**.
The program interacts with the file system by creating folders and files based on
user input, then writing installation messages to a text file.

The lab demonstrates how Java programs can create and **manage directories, generate
files, and write data** to them using `FileWriter`

## Concepts Practiced
- Using the `File` class to work with folders and files
- Checking for file and directory existence using `exists()`
- Creating directories using `mkdir()`
- Creating files using `createNewFile()`
- Writing text to a file using `FileWriter`
- Reading user input with `Scanner`
- Displaying file paths using `getAbsolutePath()`
- Basic exception handling with `IOException`

## Program Overview
- The user is prompted to enter:
  - A folder name
  - A file name
- The program checks whether the folder already exists:
  - If it does not exist, the folder is created
- A file is created inside the folder
- The program writes installation messages into the file:
  - App Installation Complete
  - Folder Created Successfully
  - Thank you for using this installer!
- The program displays the folder and file paths
- A final confirmation message is printed to the console

## Files Included
- `ApplicationInstaller.java` – Main Java program

## How the Installer Works
1. The program gathers user input using Scanner.
2. A File object is used to represent the folder.
3. The exists() method checks whether the folder already exists.
4. The mkdir() method creates the folder if needed.
5. A File object is created for the file inside the folder.
6. FileWriter writes installation messages into the file.
7. The program prints confirmation messages and file paths.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Set `ApplicationInstaller` as the main class.
3. Run the program.
4. Enter a folder name and file name when prompted.

### Command Line
1. Navigate to the folder containing `ApplicationInstaller.java.`
2. Compile the program:
```bash
   javac ApplicationInstaller.java
```
3. Run the program:
```bash
   java ApplicationInstaller
```

## Sample Output
- Prompts the user for folder and file names
- Displays the absolute path of the created folder
- Displays the absolute path of the created file
- Prints “Installation Finished!” after writing to the file

## Additional File Class Methods (Reference)
The following File class methods were discussed in the lab prompt but are not
directly used in this program. They are listed here for reference and future use.

### Checking File and Directory Status
- `exists()`
- `isDirectory()`
- `isFile()`

### Permissions
- `canRead()`
- `canWrite()`
- `canExecute()`
- `setReadable()`
- `setWritable()`
- `setExecutable()`

### File Attributes
- `getName()`
- `getParent()`
- `getPath()`
- `getAbsolutePath()`
- `length()`
- `lastModified()`

### Creating and Deleting
- `createNewFile()`
- `mkdir()`
- `mkdirs()`
- `delete()`

### Listing Directory Contents
- `list()`
- `listFiles()`

These methods allow Java programs to interact with the file system in more advanced
ways and are commonly used in installers, system utilities, and file management tools.
