# Week 10 Lab – Bubble Sort Algorithm

## Description
This lab introduces the **Bubble Sort algorithm** in Java, demonstrating how to
sort an array of integers in ascending order. The lab highlights step-by-step
comparison and swapping of adjacent elements, showing how the largest values
“bubble” to the end of the list after each pass.

## Concepts Practiced
- Bubble Sort algorithm
- Nested loops (outer loop for passes, inner loop for comparisons)
- In-place array manipulation
- Early exit optimization for already sorted arrays
- Understanding algorithm complexity (Big O notation)
- Using `Arrays.toString()` to display array contents

## Program Overview
- The `BubbleSort` class contains an integer array `list` initialized with sample data.
- The `Sort()` method implements the Bubble Sort algorithm using two nested loops:
  - Outer loop: tracks passes through the array
  - Inner loop: compares adjacent elements and swaps them if out of order
- After sorting, the largest unsorted element is placed at the end of each pass.
- The `main()` method prints the array before and after sorting to the console.

## How to Run
### IntelliJ IDEA
1. Open the project in IntelliJ IDEA.
2. Set `BubbleSort.java` as the main class.
3. Click Run.

### Command Line
1. Navigate to the `src` folder.
2. Compile:
```bash
    cd src
    javac BubbleSort.java
```
3. Run:
```bash
    java BubbleSort
```

## Sample Output
- Before sorting: [5, 3, 8, 4, 2]
- After sorting: [2, 3, 4, 5, 8]
- Demonstrates step-by-step sorting where the largest unsorted numbers
  move to their correct positions after each pass.
