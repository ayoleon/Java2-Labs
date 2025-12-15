# Week 1 Lab – Method Overloading and Overriding

## Description
This lab introduces core object-oriented programming concepts in Java, focusing on
method overloading, method overriding, constructors, and basic inheritance.

The program models employees and demonstrates how Java resolves method calls
based on parameter types and class inheritance.

## Concepts Practiced
- Constructor overloading
- Method overloading
- Method overriding
- Inheritance
- User input with `Scanner`
- Formatting output with `DecimalFormat`

## Program Overview
- The `Employee` class demonstrates constructor and method overloading.
- The `Salary()` method is overloaded to handle both integer and double calculations.
- The `EmployeeA` and `EmployeeB` classes demonstrate method overriding through
  different implementations of `computeSalary()`.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Set `Employee.java` as the main class.
3. Click Run.

### Command Line
1. Navigate to the `src` folder.
2. Compile:
   ```bash
   javac Employee.java
   ```
3. Run:
   ```bash
   java Employee
   ```

## Sample Output
- Displays employee information
- Calculates estimated and exact salary values
- Prompts the user to enter hours and wage for salary computation
