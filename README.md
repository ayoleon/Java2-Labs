# Java 2 Labs Repository

## Overview
This repository contains some of my Java 2 lab projects completed during my second Java programming course.  
The labs focus on **intermediate Java programming concepts**, including:

- Object-oriented programming: classes, objects, constructors, inheritance, interfaces 
- Method overloading and overriding  
- Arrays, multidimensional arrays, and ArrayLists  
- GUI programming with Swing and AWT  
- Event handling and parsing user input  
- Formatting output with `DecimalFormat`
- File input/output

## Course Progression
These labs reflect a progression from foundational Java concepts to more advanced, real-world application development. Later labs build directly on earlier ones, expanding functionality and introducing new programming paradigms such as graphical user interfaces, event-driven design, file input/output, and menu-based application structure.

---

## Key Skills Demonstrated Across Labs
- Applying **object-oriented principles**: classes, objects, constructors, inheritance, and interfaces  
- Implementing **method overloading and overriding**  
- Working with **arrays and ArrayLists**, including arrays of class objects  
- Handling **user input** with `Scanner` and dialog boxes  
- Building **GUI applications** with Swing and AWT, including event listeners  
- Formatting numeric output using `DecimalFormat`  
- Structuring programs with multiple classes and modular methods
- Implementing menu-driven interfaces with keyboard shortcuts
- Performing file input and output using BufferedReader and BufferedWriter
- Reusing and adapting code across multiple classes
- Event-driven programming with ActionListener, MouseListener, and MenuListener
- Managing cross-platform GUI behavior (macOS vs Windows)

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
- Weeks 1–3: Developed and tested on Windows using IntelliJ IDEA.
- Weeks 4–5: Developed and tested on macOS using IntelliJ IDEA. Some GUI behaviors may differ slightly across operating systems, including:
  - Keyboard mnemonics and menu shortcuts may behave differently due to OS-level menu handling.
  - File paths use forward slashes on macOS, which are compatible with Java’s cross-platform file handling.
  
  These differences do not affect the core functionality of the applications.
