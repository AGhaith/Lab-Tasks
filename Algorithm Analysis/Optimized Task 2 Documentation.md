# Optimized Pairing Algorithm

## Introduction

This project presents an optimized approach to finding number pairs that sum up to a given value. The traditional brute-force approach has a time complexity of **O(n²)**, but this method significantly improves it to **O(n log n)** using sorting, binary search, and efficient iteration.

## Approach

### Step 1: Sorting the Array

The input array is first sorted using QuickSort or another efficient sorting algorithm. This step has a time complexity of **O(n log n)**.

**Example:**

```
Input:  (7,10,8,4,1,2,0,9,20,30,50,100)
Sorted: (0, 1, 2, 4, 7, 8, 9, 10, 20, 30, 50, 100)
```

### Step 2: Excluding Large Numbers

If the target sum is **S**, all numbers greater than **S** can be excluded. We find the position using **binary search**, which runs in **O(log n)**.

**Example (S = 10):**

```
Filtered: (0, 1, 2, 4, 7, 8, 9, 10)
```

### Step 3: Finding Pairs Efficiently

Instead of using a nested loop (O(n²)), we iterate through the list and use **binary search** (O(log n)) to check if the required complement exists.

**Example:**
For `i = 0`, the required number is `S - 0 = 10`. We use binary search to check if `10` exists in the array.

## Complexity Analysis

### **Brute-Force Approach:**

- **O(n²)** due to nested loops.

### **Optimized Approach:**

1. Sorting: **O(n log n)**
2. Binary Search for slicing: **O(log n)**
3. Finding pairs with binary search: **O(n log n)**

**Total Complexity:**

```
O(n log n) + O(log n) + O(n log n) = O(n log n)
```

## Notes

- This solution was developed entirely without external research or AI assistance.

## Author

Ahmed Wesam Ghaith

## Contact

A.wesam2300\@nu.edu.eg
