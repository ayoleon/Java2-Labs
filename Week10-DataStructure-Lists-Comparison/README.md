## Concepts Practiced
- **ArrayList** for ordered, index-based storage
- **HashMap** for key-value pairs and fast lookups
- Iterator usage for traversing collections
- User input with Scanner
- Formatting numeric output with DecimalFormat
- Calculating averages from collection data
- Searching and removing elements in collections
- Understanding when to use different Collection Framework objects

## Program Overview
- The `StudentRecords` class manages student names and grades.
- `enterData()` collects 5 initial student names and grades from the user.
- `gradeBook()` displays all student names and their grades using an iterator.
- `averageGrades()` calculates and displays the class average.
- `search()` allows the user to search for a student by name and display their grade.
- `delete()` allows the user to remove a student by name, then updates the grade book and average.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Set `StudentRecords.java` as the main class.
3. Click Run.

### Command Line
1. Navigate to the `src` folder.
2. Compile:
```bash
    cd src
    javac StudentRecords.java
```
3. Run:
```bash
    java StudentRecords
```

## Sample Output
- Prompts the user to enter 5 student names and grades.
- Displays all student grades.
- Calculates and displays the class average.
- Prompts for a student name to search and displays the corresponding grade.
- Prompts for a student name to delete, removes them from records, then redisplays the updated grade book and average.
