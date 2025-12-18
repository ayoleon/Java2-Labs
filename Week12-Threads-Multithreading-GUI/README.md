# Week 12 Lab – Basic Threads, Multithreading, and GUI Interaction

## Description
This lab introduces **multithreading** in Java through a graphical user interface **(GUI)**.
The program demonstrates how threads can be created and executed using the `Thread`
class, the `Runnable` **interface**, and `ProcessBuilder` to **run multiple tasks concurrently**.

A **Swing-based GUI** is used to trigger different threaded operations, including opening
external applications and computing interest using a nested static class.

## Objectives
- Understand what a thread is in Java
- Create threads using the `Thread` class
- Create threads using the `Runnable` interface
- Use `ProcessBuilder` to launch external programs
- Run multiple threads simultaneously
- Reinforce GUI concepts using Swing
- Demonstrate **nested static classes** for utility-style programs

## Concepts Practiced
- **Multithreading** and **concurrency**
- Thread creation and execution
- `Runnable` **interface**
- `Thread.sleep()` for execution delay
- `ProcessBuilder` and `Runtime.exec()`
- Java Swing GUI components
- `ActionListener` and **event handling**
- Nested static classes
- `JOptionPane` for user input and output

## Program Overview
The program consists of a GUI window divided into three panels, each containing
buttons that trigger different threaded actions.

### Panel 1 – Calculator Threads
- Button 1:
  - Uses a class that `extends Thread`
  - Opens the Windows Calculator
  - Pauses execution for 5 seconds using `Thread.sleep()`
  - Displays a confirmation message using `JOptionPane`
- Button 2:
  - Uses a class that `implements Runnable`
  - Performs the same task as Button 1 using a different threading approach

### Panel 2 – ProcessBuilder Threads
- Button 1:
  - Uses ProcessBuilder to open a web browser (Microsoft Edge)
- Button 2:
  - Uses `ProcessBuilder` to open two applications simultaneously
  - Applications include **Notepad** and **Calculator**
  - Both programs run at the same time without delay

### Panel 3 – Nested Static Class Utility
- Button:
  - Calls a method from a nested static class
  - Prompts the user for a dollar amount using `JOptionPane`
  - Calculates 15 percent interest on the amount
  - Displays:
    - Original amount
    - Interest earned
    - Total amount after interest

## Files Included
- `MainFrame.java` – Main GUI window and event handling
- `CalcThread.java` – Thread class that opens Calculator
- `CalcThread2.java` – Runnable implementation that opens Calculator
- `BrowserThread.java` – Runnable that opens a web browser using ProcessBuilder
- `twoAppThread.java` – Runnable that opens two applications simultaneously
- `Banking.java` – Contains a nested static class for interest calculation

## How the Program Works
1. The GUI is created using Swing with three panels.
2. Each button is registered with an `ActionListener`.
3. When a button is clicked:
   - A new thread is created and started
   - External applications are launched without blocking the GUI
4. Threads run independently, allowing multiple tasks to execute at the same time.
5. The interest calculator demonstrates the use of a nested static utility class.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure all Java files are located in the src folder.
3. Set `MainFrame` as the main class.
4. Run the program.
5. Click the buttons to trigger threaded actions.

### Command Line
1. Navigate to the `src` folder.
2. Compile all Java files:
```bash
   javac *.java
```
3. Run the program:
```bash
   java MainFrame
```

## Sample Output
- Opens Windows Calculator and displays a delayed confirmation message
- Opens a web browser using `ProcessBuilder`
- Opens Notepad and Calculator simultaneously
- Prompts the user to enter a dollar amount
- Displays calculated interest and total balance using JOptionPane

## Notes
- Threads allow multiple tasks to run concurrently without freezing the GUI.
- Runnable provides an alternative to extending Thread and is often preferred for flexibility.
- Nested static classes are useful for reusable utility functions shared across programs.
