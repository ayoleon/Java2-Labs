
# Week 3 Lab – GUI Programming with Swing and AWT

## Description
This lab introduces graphical user interface (GUI) development in Java using
Swing and AWT libraries. The program allows user interaction through windows,
buttons, text fields, and dialog boxes.

## Concepts Practiced
- Swing and AWT components
- JFrame, JLabel, JTextField, JButton
- Layout managers (GridLayout)
- Interfaces
- Event handling with ActionListener
- Parsing user input
- Basic GUI-based calculations

## Program Overview
- The `PlayerSalary` class calculates the average weekly salary using dialog boxes.
- The `PlayerTitle` class creates a GUI window for entering and displaying player information.
- Implements an interface to enforce method structure.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Set `Main.java` as the main class.
3. Click Run.
4. Enter weekly salaries in the dialog boxes.
5. Enter first name, last name, and position in the GUI window and click ENTER to display information.

### Command Line
1. Navigate to the `src` folder.
2. Compile:
   ```bash
   javac Main.java
   ```
3. Run:
   ```bash
   java Main
   ```

## Sample Output
- PlayerSalary: Dialog boxes appear sequentially asking for weekly salaries. Displays a message box with the average weekly salary.
- PlayerTitle GUI: Window displays text fields for first name, last name, and position. After entering values and clicking ENTER, the output fields display the entered information.
- Demonstrates GUI creation and layout management.
- Uses event listeners to update displayed values dynamically
