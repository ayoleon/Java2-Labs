## Description
This lab introduces menu-driven programming in Java Swing with an emphasis on file input/output operations. The application uses a menu system to write customer data to a file, read data back from the file, and process movie rental or purchase payments. The lab demonstrates how menu listeners interact with different program components and how data can persist outside the application using files.

## Concepts Practiced
- Java Swing menu components (JMenuBar, JMenu, JMenuItem)
- MenuListeners and menu events
- Keyboard shortcuts and mnemonics
- File writing using BufferedWriter
- File reading using BufferedReader
- JOptionPane input and message dialogs
- While loops for input validation
- Reusing code across multiple classes
- Event-driven programming with menus
- Program termination using System.exit(0)

## Program Overview
This program consists of six Java classes.

### Main
- Contains the main method.
- Launches the application by instantiating the menu frame.

### MenuFrame
- Creates the main application window and menu system.
- Implements a menu bar with File and Payment menus.  

- File menu options include:
  - Write to File
  - Read from File
  - Quit

- Payment menu options include:
  - Rent
  - Buy

Menu items use ActionListeners and MenuListeners to trigger program actions.
The Read from File option is dynamically enabled only after a file has been created.

### WriteFile
- Handles writing customer data to a text file named CustomerData.txt.
- Uses BufferedWriter to append data to the file.
- Prompts the user for input using dialog boxes.
- Collects exactly three customer records using a while loop for validation.
- Each record stores the customer’s last name, age, and selected movie.

### ReadFile
- Handles reading data from CustomerData.txt.
- Uses BufferedReader to read each line from the file.
- Displays stored customer records using message dialogs.

### rentPay
- Calculates the subtotal for renting movies.
- Prompts the user for the number of movies using an input dialog.
- Validates user input and displays the rental total.

### buyPay
- Calculates the subtotal for purchasing movies.
- Prompts the user for the number of movies using an input dialog.
- Validates user input and displays the purchase total.

## Application Features
- Menu-driven interface similar to standard desktop applications
- Keyboard shortcuts for menu items
- Persistent data storage using text files
- Input validation using while loops
- Movie rental pricing at $3.99 per movie
- Movie purchase pricing at $29.95 per movie
- Dynamic enabling of menu options
- Graceful program exit using System.exit(0)

## How to Run

### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure all Java files are located in the same src folder or package.
3. Set Main.java as the main class.
4. Click Run.
5. Use the menu options to write data, read data, and process payments.

### Command Line
1. Navigate to the src folder.
2. Compile all Java files.
3. Run the Main class.

### Sample Output
- A window containing a menu bar with File and Payment menus.
- Dialog boxes prompt the user to enter customer information.
- Customer records are written to and read from a text file.
- Message dialogs display stored customer data.
- Rental and purchase totals are calculated and displayed based on user input.
- Demonstrates menu-based event handling, file I/O, and code reuse.

## Platform Notes (macOS)
- This project was developed and tested on macOS. Some GUI behaviors differ slightly across operating systems:

  - Keyboard mnemonics and menu shortcuts may behave differently on macOS compared to Windows due to OS-level menu handling.
  - Cross-platform shortcut keys were implemented where applicable using the system menu shortcut mask.
  - File paths use forward slashes, which are standard on macOS and supported by Java’s cross-platform file handling.  
These differences do not affect the core functionality of the application.
