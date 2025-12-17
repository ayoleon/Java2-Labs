# Week 9 Lab – Recursion and Iteration Comparison

## Description
This lab focuses on understanding the concept of recursion and comparing it to iteration (loops).
The program demonstrates:

- A countdown implemented using both recursion and iteration
- Multiplication of two numbers using recursion
- Comparison of recursive and iterative approaches

User input is collected using the Scanner class.

## Concepts Practiced
- Recursive methods
- Base cases and recursive cases
- Iterative solutions using loops
- Stack behavior in recursion
- Comparing recursion vs iteration
- User input handling with Scanner

## File Structure
```bash
Week09-Recursion/
|
|-- src/
|   |-- Recursion.java
|
|-- README.md
```

## Program Features
Countdown:
- Iterative countdown using a while loop
- Recursive countdown using a method that calls itself
- Displays a "Blast Off" message at completion

Multiplication:
- Iterative multiplication using standard arithmetic
- Recursive multiplication using repeated addition
- Demonstrates how recursion can replace loops

## How to Run
### IntelliJ IDEA:
1. Open the project in IntelliJ IDEA.
2. Ensure `Recursion.java` is inside the src folder.
3. Run `Recursion.java`
4. Follow the prompts in the console.

### Command Line:
1. Navigate to the src folder:
```bash
   cd Week09-Recursion/src
```
2. Compile the program:
```bash
   javac Recursion.java
```
3. Run the program:
```bash
   java Recursion
```

## Notes
- Only one section is active at a time in main.
- Other method calls are commented out to allow testing individual parts.
- Recursive methods rely on a base case to prevent infinite recursion.
- Recursion can use more memory due to stack usage compared to iteration.
