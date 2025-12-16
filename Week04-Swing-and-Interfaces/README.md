# Week 4 Lab – Panels, Interfaces, and Event Listeners in Java Swing

## Description
This lab expands on Java GUI development using Swing by introducing multiple panels, interfaces, and event-driven programming. The application simulates a simple movie rental store checkout system that allows users to enter customer information, rent or buy movies, and complete a checkout process using either cash or credit.

## Concepts Practiced
- Java Swing GUI components
- JFrame with multiple JPanels
- Layout managers (BorderLayout, GridLayout)
- Interfaces and method implementation
- ActionListener and MouseListener
- TextField-based input and output
- JOptionPane input and message dialogs
- Parsing user input (String to int / double)
- Boolean logic for conditional fees
- Basic GUI-based calculations

## Program Overview
This program consists of three Java classes.

### MovieRental
- Contains the main method.
- Launches the application by instantiating the main frame.

### TransactionFRAME
- Extends JFrame and implements the Checkout interface and MouseListener.
- Uses two panels.

### Panel 1 – Customer Information Panel
- Collects and displays:
  - Membership ID
  - First Name
  - Last Name
  - Phone Number
  - Age
  - Chosen Movie

User input is accepted through text fields and displayed back using output-only text fields.

### Panel 2 – Checkout Panel
Handles:
- Number of movies rented or purchased
- Rent versus buy calculations
- Late fee logic using a Boolean variable
- Cash and credit payment options
- Credit card fee handling

Demonstrates event-driven programming using both ActionListener and MouseListener.

### Checkout Interface
- Defines the Payment(String message) method.
- Enforces a consistent checkout structure.
- Implemented by TransactionFRAME.

## Application Features
- Rent movies at $3.99 per video
- Buy movies at $29.95 per video
- Late fee of $1.00 when applicable
- Credit card fee of $5.00
- Supports both text field input and dialog box input
- Displays checkout summaries using message dialogs

## How to Run

### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure all Java files are in the same package or default package.
3. Set MovieRental.java as the main class.
4. Click Run.
5. Enter customer information in Panel 1 and submit.
6. Complete the checkout process using Panel 2.

### Command Line
1. Navigate to the src folder.
2. Compile all Java files.
3. Run the MovieRental class.

## Sample Output
A GUI window with two panels.  
The left panel displays customer information.  
The right panel performs checkout calculations.  
Dialog boxes prompt the user for the number of videos and credit card number if applicable.  
Message dialogs display the subtotal, late fee, card fee, and final total.  
Demonstrates GUI layout management, interfaces, and event listeners.  
