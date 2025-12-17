# Java 2 Labs Repository
## Overview
This repository contains my Java 2 lab projects from my second Java programming course.  
The labs cover **intermediate Java programming concepts** and real-world application development, including:

- Object-oriented programming: classes, objects, constructors, inheritance, and interfaces  
- Method overloading and overriding  
- Arrays, multidimensional arrays, and ArrayLists  
- GUI programming with Swing and AWT  
- Event handling and user input parsing  
- Formatting output with `DecimalFormat`  
- File input/output operations  
- Database integration with JDBC and Microsoft Access  
- Multi-class GUI design and event-driven programming  
- Basic networking with Java sockets (`ServerSocket`, `Socket`)  
- Recursive and iterative problem solving  
- Basic sorting algorithms (Bubble Sort)  
- Using Java collections: ArrayList, LinkedList, and HashMap, with emphasis on appropriate use cases
 

## Course Progression
These labs reflect a progression from foundational Java concepts to more advanced, real-world application development. Later labs build on earlier ones, expanding functionality and introducing new programming paradigms such as graphical user interfaces, event-driven design, file input/output, and menu-based application structures. Students also practice algorithmic thinking through recursion and sorting (Bubble Sort), explore basic networking with client-server communication, and learn to select and use appropriate Java Collection Framework structures such as ArrayList, LinkedList, and HashMap.

---

## Key Skills Demonstrated Across Labs
- Applying **object-oriented principles**: classes, objects, constructors, inheritance, and interfaces  
- Implementing **method overloading and overriding**  
- Working with **arrays and ArrayLists**, including arrays of class objects  
- Using **Java Collection Framework**: ArrayList, LinkedList, HashMap; adding, searching, deleting, and iterating elements  
- Implementing **sorting algorithms** (Bubble Sort) and understanding algorithm efficiency  
- Handling **user input** with `Scanner` and dialog boxes  
- Building **GUI applications** with Swing and AWT, including event listeners and multi-panel layouts  
- Formatting numeric output using `DecimalFormat` and computing aggregates (e.g., averages)  
- Performing **file input/output** using `BufferedReader` and `BufferedWriter`  
- Connecting to databases using **JDBC (UCanAccess)** and executing SQL (`SELECT`, `INSERT`, `CREATE TABLE`, `WHERE`)  
- Implementing **basic client-server communication** using `ServerSocket`, `Socket`, and input/output streams  
- Understanding **recursion**, base cases, recursive calls, and comparing recursive vs iterative approaches  
- Recognizing performance and memory tradeoffs between recursion, loops, and different data structures  
- Structuring programs with multiple interacting classes and modular methods  
- Managing **cross-platform GUI behavior** (macOS vs Windows)  

---

## Labs Included

### Week 1 – Method Overloading and Overriding
- **Description:** Demonstrates method and constructor overloading, method overriding, and inheritance using an employee payroll example.  
- **Concepts:** Constructor overloading, method overloading, method overriding, inheritance, `Scanner` input, `DecimalFormat` output.  
- **File:** `Employee.java`  
- **How to Run:**  
  **IntelliJ IDEA:** Set `Employee.java` as main class and Run.  
  **Command Line:**
  ```bash
  cd src
  javac Employee.java  
  java Employee
  ```
- **Sample Output:**  
  - Displays employee information  
  - Calculates estimated and exact salaries  
  - Prompts for hours and wage input  

### Week 2 – Multidimensional Arrays and ArrayLists
- **Description:** Handles player rosters and baseball scoreboards using arrays, multidimensional arrays, and ArrayLists of class objects.  
- **Concepts:** Arrays, multidimensional arrays, ArrayLists, iterators, class objects, `Scanner` input.  
- **File:** `Baseball.java`  
- **How to Run:**  
**IntelliJ IDEA:** Set `Baseball.java` as main class and Run.  
**Command Line:**
```bash
cd src  
javac Baseball.java  
java Baseball
```
- **Sample Output:**  
  - Prompts for player names  
  - Displays player roster  
  - Simulates a scoreboard with multidimensional arrays  
  - Demonstrates arrays and ArrayLists of class objects

### Week 3 – GUI Programming with Swing and AWT
- **Description:** Introduces GUI development using Swing and AWT, including dialog boxes, text fields, buttons, and event handling.  
- **Concepts:** JFrame, JLabel, JTextField, JButton, GridLayout, ActionListener, interfaces, parsing input, GUI calculations.  
- **File:** `Main.java`  
- **How to Run:**  
**IntelliJ IDEA:** Set `Main.java` as main class and Run.  
**Command Line:**  
```bash
cd src  
javac Main.java  
java Main
```
- **Sample Output / GUI Behavior:**  
  - **PlayerSalary:** Sequential dialog boxes asking for weekly salaries and showing average salary.  
  - **PlayerTitle GUI:** Window allows entering first name, last name, and position; clicking ENTER displays the values dynamically.  
  - Demonstrates GUI creation and layout management  
  - Uses event listeners to update displayed values dynamically

### Week 4 - Panels, Interfaces, and Event Listeners in Java Swing
- **Description:** Expands on Java GUI development by introducing multiple panels, interfaces, and event-driven programming. Simulates a movie rental checkout system that allows entering customer information, renting or buying movies, and completing checkout with cash or credit.
- **Concepts:** Java Swing GUI components, multiple JPanels, BorderLayout and GridLayout, ActionListener, MouseListener, interfaces, JOptionPane input/output, parsing, Boolean logic for conditional fees.
- **Files:** `MovieRental.java`, `TransactionFRAME.java`, `Checkout.java`
- **How to Run:**
**IntelliJ IDEA:** Set `MovieRental.java` as main class and Run.
**Command Line:**
```bash
cd src
javac *.java
java MovieRental
```
- **Sample Output:**  
 **Two-panel GUI:** left panel collects customer info, right panel handles checkout
  - Dialogs prompt for number of videos and credit card number if applicable
  - Calculates subtotal, late fees, card fees, and total
  - Demonstrates multi-panel layout, event listeners, and interface implementation

### Week 5 - Menus, File I/O, and Event Handling in Java Swing
- **Description:** Introduces menu-driven programming with file input/output operations. Users can write customer data to a file, read data back, and process movie rental or purchase payments through a menu system.
- **Concepts:** JMenuBar, JMenu, JMenuItem, MenuListener, keyboard shortcuts, BufferedWriter and BufferedReader, JOptionPane input/output, while loops for input validation, code reuse, event-driven programming, System.exit(0).
- **Files:** `Main.java`, `MenuFrame.java`, `WriteFile.java`, `ReadFile.java`, `rentPay.java`, `buyPay.java`
- **How to Run:**
**Intellij IDEA:** Set `Main.java` as main class and Run.
**Command Line**
```bash
cd src
javac *.java
java Main
```
- **Sample Output:**
  - Menu bar with File and Payment menus
  - Dialogs prompt for customer info and number of videos
  - Customer records are stored in and read from a text file
  - Rental and purchase totals are calculated and displayed
  - Demonstrates menu-based event handling, file I/O, and code reuse

### Week 6 – Movie Database with File I/O and Menu-Driven GUI
- **Description:** Implements a menu-driven movie database using Java Swing. Users can open a movie file to view movie data one character at a time or create a backup copy of the file. Demonstrates low-level file handling combined with a simple GUI.  
- **Concepts:** Java Swing components (`JFrame`, `JMenu`, `JMenuItem`, `JOptionPane`), ActionListener, File I/O using `FileInputStream` and `FileOutputStream`, buffered copying, arrays for buffering, FlowLayout, System.exit(0).  
- **Files:** `MovieBackup.java`, `Movies/Movie.txt`, `Movies/MovieBackup.txt`  
- **How to Run:**  
**IntelliJ IDEA:** Set `MovieBackup.java` as main class and Run. Ensure `Movies/Movie.txt` exists.  
**Command Line:**
```bash
cd src
javac MovieBackup.java
java MovieBackup
```
- **Sample Output:**
  - **Open Movies:** Each character of Movie.txt is displayed in a JOptionPane dialog sequentially.
  - **Backup Movies:** Creates MovieBackup.txt as a copy of Movie.txt.
  - **Exit:** Closes the program cleanly.
 
 ### Week 7 – Movie Database with Java Swing and Access
- **Description:** Creates a simple movie customer database using Java Swing and Microsoft Access. Users can view and add customer entries in a GUI. JDBC (UCanAccess) is used to connect to the Access database.  
- **Concepts:** Java Swing GUI (`JFrame`, `JTextField`, `JButton`, `JMenuBar`), ActionListener, JDBC, SQL (`SELECT`, `INSERT`), handling database connections, modular methods.  
- **Files:** 
  - `DBase.java`  
  - `database/Movie.accdb`  
  - `jdbc/ucanaccess-4.0.1/*.jar` (inside the lab folder)  
- **How to Run:**  
**IntelliJ IDEA:** Add the `jdbc/ucanaccess-4.0.1` folder in this lab as a library, set `DBase.java` as the main class, Run.  
**Command Line:**
```bash
cd src
javac DBase.java
java DBase
```
- **JDBC Notes:**
This lab includes its own jdbc/ucanaccess-4.0.1 folder with all necessary .jar files. In IntelliJ IDEA, go to File → Project Structure → Libraries → Add and select the folder.

### Week 8 – Movie Database with Payment System
- **Description:** Extends Week 7 by adding a payment system. Users can create a payment table, add records, display payment info, and perform checkout with tax calculation. GUI split into Customer Panel and Payment Panel.  
- **Concepts:** Java Swing GUI panels, layout managers (`JPanel`, `GridLayout`, `BorderLayout`), ActionListener, JDBC, SQL (`CREATE TABLE`, `INSERT`, `SELECT`, `WHERE`), passing data between classes, event-driven programming.  
- **Files:** 
  - `DBase.java`  
  - `Payment.java`  
  - `PaymentMethod.java`  
  - `database/Movie.accdb`  
  - `jdbc/ucanaccess-4.0.1/*.jar` (inside the lab folder)  
- **How to Run:**  
**IntelliJ IDEA:** Add the `jdbc/ucanaccess-4.0.1` folder in this lab as a library, set `DBase.java` as the main class, Run.  
**Command Line:**
```bash
cd src
javac DBase.java Payment.java PaymentMethod.java
java DBase
```
- **JDBC Notes:**  
This lab includes its own `jdbc/ucanaccess-4.0.1` folder with all necessary `.jar` files. In IntelliJ IDEA, go to **File → Project Structure → Libraries → Add** and select the folder.

### Week 9 – Recursion and Iteration Comparison
- **Description:** Demonstrates the use of recursion and iteration to solve common programming problems. The lab includes a countdown example and multiplication of two numbers, implemented using both recursive and iterative approaches.
- **Concepts:** Recursive methods, base cases, recursive calls, stack usage, iterative loops, comparison of recursion vs iteration, user input handling with Scanner.
- **Files:**
  - `Recursion.java`
- **How to Run:**
  **IntelliJ IDEA:** Set `Recursion.java` as the main class and Run.
  Command Line:
  ```bash
    cd src
    javac Recursion.java
    java Recursion
  ```
- **Notes:**
  - Only one section of the program is active at a time in main.
  - Other method calls are commented out to allow testing different parts of the lab.
  - Recursive methods rely on a base case to prevent infinite recursion.

### Week 9 – Simple Client-Server Communication with Java Sockets
- **Description:** Introduces basic networking concepts in Java through a simple client-server application. A server listens for incoming connections, sends a message to a client, and receives a response using socket communication.  
- **Concepts:** Client-server architecture, Java networking (`ServerSocket`, `Socket`), input/output streams, `PrintWriter`, `BufferedReader`, exception handling, ports and localhost communication.  
- **Files:** 
  - `SimpleServer.java`  
  - `SimpleClient.java`  
- **How to Run:**  
**IntelliJ IDEA:**  
1. Run `SimpleServer.java` first to start the server.  
2. Run `SimpleClient.java` in a separate run window to connect to the server.  

**Command Line:**
```bash
cd src
javac SimpleServer.java SimpleClient.java
java SimpleServer
```
(Open a second terminal window)
```bash
java SimpleClient
```
## Notes
- The server must be running before the client connets.
- Communication occurs over port 5000 using localhost.
- This lab demonstrates basic socket communication with a single client.

### Week 10 – Bubble Sort Algorithm
- **Description:** Implements the Bubble Sort algorithm to sort an array of integers in ascending order. Demonstrates nested loops, element comparison, and swapping.
- **Concepts:** Sorting algorithms, nested loops, array manipulation, ascending/descending order, early exit optimization.
- **Files:** `BubbleSort.java`
- **How to Run:**
  **IntelliJ IDEA:** Set `BubbleSort.java` as main class and Run.
  **Command Line:**
  ```bash
  cd src
  javac BubbleSort.java
  java BubbleSort
  ```
- **Sample Output:**
  - Original unsorted array displayed
  - Sorted array displayed after applying Bubble Sort

### Week 10 – Data Structures Comparison
- **Description:** Compares different Java collection types for storing and managing student records. Students enter names and grades, and the program demonstrates adding, searching, and deleting entries.
- **Concepts:** Java Collection Framework, ArrayList, LinkedList, HashMap, iteration with iterators, containsKey(), basic data manipulation, average computation, user input with Scanner.
- **Files:** `StudentRecords.java`
- **How to Run:**
  **IntelliJ IDEA:** Set `StudentRecords.java` as main class and Run.
  **Command Line:**
  ```bash
  cd src
  javac StudentRecords.java
  java StudentRecords
  ```
- **Sample Output:**
  - Prompts for student names and grades
  - Displays each student's grade
  - Displays class average
  - Allows searching for a student by name
  - Allows removing a student and updates grade display
---

## How to Run All Labs
All programs were **developed, compiled, and tested in IntelliJ IDEA**.  

To run any lab:  
1. Open the project in IntelliJ IDEA.
2. Ensure all Java files are in the same src folder or package.
3. Set the desired `.java` file as the main class.  
4. Click the green **Run** button.  
5. Follow the on-screen prompts for input (console or GUI depending on the lab).

---

## Platform Notes
- Weeks 1–3, 6-13: Developed and tested on Windows using IntelliJ IDEA.
- Weeks 4–5: Developed and tested on macOS using IntelliJ IDEA. Some GUI behaviors may differ slightly across operating systems, including:
  - Keyboard mnemonics and menu shortcuts may behave differently due to OS-level menu handling.
  - File paths use forward slashes on macOS, which are compatible with Java’s cross-platform file handling.
  
  These differences do not affect the core functionality of the applications.
