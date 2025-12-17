# Java Data Structures Comparison

This file summarizes commonly used Java data structures, their characteristics, and best use cases.  
It’s designed as a quick reference for students learning when to use each structure.

## Data Structure Comparison

| Data Structure | Type            | Key Features                     | Common Use Case                        | Example Methods                     |
|----------------|----------------|---------------------------------|---------------------------------------|------------------------------------|
| ArrayList      | List (Dynamic)  | Resizable, ordered, allows duplicates | General-purpose lists, storing objects dynamically | add(), get(), remove(), size()     |
| HashMap        | Key–Value Map   | Stores pairs, unique keys, fast lookup | Storing data with a unique key (e.g., ID → Name) | put(), get(), containsKey(), remove() |
| LinkedList     | List (Nodes)    | Sequential nodes, efficient insertions/removals | Queues, stacks, or dynamic ordered lists | addFirst(), addLast(), removeFirst(), getFirst() |
| Array          | Primitive       | Fixed size, simple and fast     | When data size is known ahead of time  | length, [index] access             |
| HashSet        | Set (No Duplicates) | Unordered, no duplicate elements | Unique item storage (e.g., student IDs) | add(), contains(), remove()       |

## Notes

- **ArrayList** and **HashMap** are the most commonly used structures because they balance flexibility and performance.  
- Use **LinkedList** when you need fast insertions/removals in the middle of a list.  
- Use **Array** when the number of elements is fixed and performance matters.  
- Use **HashSet** to store unique items with fast lookup.  
