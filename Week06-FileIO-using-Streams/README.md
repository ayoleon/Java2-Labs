# Week 6 Lab – Movie Database with Java Swing and File I/O

## Description
This lab focuses on creating a basic movie database application using Java Swing and file input/output. The program reads and backs up movie data from text files, demonstrating low-level file handling and simple GUI menus. The application uses a `Movie.txt` file to store movie data and creates a backup copy in `MovieBackup.txt`.

## Concepts Practiced
- Java Swing GUI components (`JFrame`, `JMenu`, `JMenuItem`, `JOptionPane`)
- ActionListeners for menu items
- File I/O using `FileInputStream` and `FileOutputStream`
- Reading files one character at a time
- Buffered file copying using byte arrays
- Basic array usage for buffering
- Layout managers (FlowLayout)
- Exiting the application with `System.exit(0)`

## Program Overview
The program consists of a single Java class:

### MovieBackup
- Extends `JFrame` and sets up the main application window (`MoviePlex`) with size 800x600.
- Creates a menu bar with a `File` menu containing three items:
  1. **Open Movies** – Reads `Movie.txt` character by character and displays the contents using `JOptionPane`.
  2. **Backup Movies** – Copies `Movie.txt` to `MovieBackup.txt` using a buffered byte array.
  3. **Exit** – Closes the application using `System.exit(0)`.

- The program demonstrates handling of files stored in a specific directory (`C:\Users\<username>\Movies`) and uses file paths hardcoded for simplicity.

## File Structure
```bash
Week6Lab/
│
├─ src/
│ └─ MovieBackup.java
│
├─ Movies/
│ ├─ Movie.txt
│ └─ MovieBackup.txt
│
└─ README.md
```
### Movie.txt Example
1,Aquaman,Action-Fantasy,160000000,Jason Momoa

## How to Run

### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure `MovieBackup.java` is in the `src` folder.
3. Verify that `C:\Users\<username>\Movies\Movie.txt` exists and contains movie data.
4. Run `MovieBackup.java` to launch the GUI.
5. Use the File menu to open or back up movie data.

### Command Line
1. Navigate to the `src` folder.
2. Compile:
```bash
javac MovieBackup.java
```
3. Run:
```bash
java MovieBackup
```

## Application Feautures
- Open movie data and display each character using a message dialog.
- Backup the movie file using buffered I/O.
- Exit the program cleanly through the menu.
- Demonstrates a simple menu-driven GUI combined with file operations.

## Sample Output
- **Open Movies:** displays each character of Movie.txt in a JOptionPane dialog box (so you can write something like Dialog shows: "1", then "A", then "q", etc.).
- **Backup Movies:** silently creates a copy of Movie.txt as MovieBackup.txt.
