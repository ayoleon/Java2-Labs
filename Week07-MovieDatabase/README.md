# Week 7 Lab – Movie Database with Java Swing and Access

## Description
This lab creates a simple movie customer database using Java Swing and Microsoft Access. The program allows you to:

- View up to 3 customer records  
- Add new customer entries  
- Display customer information in text fields  

The database connection is handled through **UCanAccess JDBC**.

## Concepts Practiced
- Java Swing GUI components (`JFrame`, `JButton`, `JTextField`, `JMenuBar`)  
- ActionListeners for buttons and menu items  
- JDBC connection to Access databases  
- SQL statements (`SELECT`, `INSERT`)  
- Handling database connections in Java  

## File Structure
```bash
Week7Lab/
│
├─ src/
│ └─ DBase.java
│
├─ database/
│ └─ Movie.accdb
│
├─ jdbc/
│ └─ ucanaccess-4.0.1/ (all extracted .jar files)
│
└─ README.md
```
## JDBC Setup Instructions
### Using Included JDBC Folder
1. The `jdbc/ucanaccess-4.0.1` folder is included in this repository and contains all required `.jar` files.
2. Open your project in IntelliJ IDEA.
3. Go to **File → Project Structure → Libraries → Add**.
4. Select the extracted `jdbc/ucanaccess-4.0.1` folder containing the `.jar` files.
5. Apply changes and make sure the library appears under **External Libraries**.
### Download UCanAccess
1. Go to the official UCanAccess download page: https://ucanaccess.github.io/site.html
2. Download the latest stable version ZIP (e.g., ucanaccess-4.0.1.zip)

    ### Add JDBC to IntelliJ
    1. Extract the ZIP file to a folder on your computer (do not keep it zipped).
    2. Open your project in IntelliJ IDEA.
    3. Go to File → Project Structure → Libraries → Add.
    4. Select the extracted ucanaccess-4.0.1 folder containing the .jar files.
    5. Apply changes and make sure the library appears under External Libraries.


## Notes
The program uses a hardcoded path for the Access database. Update in DBase.java if needed:
```bash
String dbname = "C://users//lamva//Movie.accdb";
```

## How to Run
### IntelliJ IDEA
1. Ensure DBase.java is in src/.
2. Verify Movie.accdb is in the database/ folder.
3. Run DBase.java to launch the GUI.

### Command Line
1. Navigate to the src folder:
```bash
cd Week7Lab/src
```
2. Compile:
```bash
javac DBase.java
```
3. Run:
```bash
java DBase
```
