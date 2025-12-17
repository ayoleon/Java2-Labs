# Week 8 Lab – Movie Database with Payment System

## Description
This lab extends the Week 7 movie database with a **Payment system**. The program now includes:

- Customer database management (view and add customers)  
- Creating a **Payment** table in the Access database  
- Adding and displaying payment method records  
- Checkout functionality for renting or buying movies with tax calculation  

The GUI is split into **Customer Panel** and **Payment Panel**, with buttons to interact with the database.

## Concepts Practiced
- Java Swing panels and layout managers (`JPanel`, `GridLayout`, `BorderLayout`)  
- Event handling using **ActionListener** and `getSource()`  
- JDBC interaction with Access databases  
- SQL statements (`CREATE TABLE`, `INSERT`, `SELECT`, `WHERE`)  
- Calculating totals including tax  
- Passing data between GUI classes (`DBase`, `Payment`, `PaymentMethod`)  

## File Structure
```bash
Week8Lab/
│
├─ src/
│ ├─ DBase.java
│ ├─ Payment.java
│ └─ PaymentMethod.java
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
- The program uses a hardcoded path for the Access database. Update in DBase.java if needed:
```bash
String dbname = "C://users//lamva//Movie.accdb";
```
- Payment table and customer checkout simulate simple transactions. Taxes are stored as integers (%) in the Payment table.

## How to Run
### IntelliJ IDEA
1. Ensure all .java files (DBase.java, Payment.java, PaymentMethod.java) are in src/.
2. Verify Movie.accdb is in the database/ folder.
3. Run DBase.java to launch the GUI.
### Command Line
1. Navigate to the src folder:
```bash
cd Week8Lab/src
```
2. Compile:
```bash
javac DBase.java Payment.java PaymentMethod.java
```
3. Run:
```bash
java DBase
```
