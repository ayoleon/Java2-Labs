# Week 11 Lab – Reading File Data into an ArrayList

## Description
This lab focuses on reading numeric data from a text file and storing it into a dynamic
data structure using Java. The program uses a Scanner to read values from an external
file, stores them in an ArrayList, and performs basic data analysis on the collected values.

The lab demonstrates how file input can be combined with Java collections to process
and analyze data efficiently.

## Concepts Practiced
- File input using File and Scanner
- Reading data from a `.txt` file
- Using ArrayList for flexible data storage
- Traversing an ArrayList using enhanced for-loops
- Calculating:
  - Total sum
  - Average
  - Minimum and maximum values
- Sorting an ArrayList using `Collections.sort()`
- Formatting numeric output with DecimalFormat

## Program Overview
- The program reads integer values from a text file (numbers.txt).
- Each value is stored in an ArrayList<Integer> called monthly.
- The program processes the list to compute:
  - Total sum of all values
  - Average of the values
  - Minimum and maximum values
- Results are displayed to the console.

## Files Included
- `FileData.jav`a – Main Java program
- `numbers.txt` – Text file containing numeric data (one number per line)

Note: The numbers.txt file must be included in the repository for the program to run correctly.

## Important Note About File Path
The program currently uses an absolute file path:
```bash
C:\Users\lamva\numbers.txt
```
If running this program on a different machine or environment, update the file path
to match the local location of numbers.txt, or place the file in the project directory
and use a relative path instead.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Ensure `numbers.txt` is accessible at the specified file path.
3. Set `FileData` as the main class.
4. Click Run.

### Command Line
1. Navigate to the folder containing `FileData.java`
2. Compile the program:
```bash
   javac FileData.java
```
3. Run the program:
```bash
   java FileData
```

## Sample Output
- Displays all numbers stored in the ArrayList
- Displays the total sum of the values
- Displays the average (formatted to two decimal places)
- Displays the minimum and maximum values
