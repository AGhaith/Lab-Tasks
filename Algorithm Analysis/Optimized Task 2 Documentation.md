# Optimized Task 2 - Documentation

## Overview

This script implements an optimized approach to find all unique pairs in an array whose sum equals a given target value. The solution utilizes **Quick Sort** for sorting and **Binary Search** for efficient lookups.

## Features

- **Binary Search (O(log N))**: Efficiently searches for an element in a sorted array.
- **Quick Sort (O(N log N))**: Sorts the array before searching for pairs.
- **Pair Finding Algorithm (O(N log N))**: Uses binary search to efficiently locate required pairs.
- **Overall Complexity: O(N log N)**

## Implementation Details

### 1. Binary Search

```python
def Binary_Search(Array, Key):
```

- Performs a binary search on a sorted array.
- Returns the index of the key if found, else returns `-1`.

### 2. Quick Sort

```python
def Quick_Sort(start, end, Array):
```

- Sorts the array using the Quick Sort algorithm.
- Utilizes a partitioning method for recursive sorting.

### 3. Finding Pairs

```python
def Find_Pairs(Array, Target_Sum):
```

- Sorts the array using **Quick Sort**.
- Uses **Binary Search** to efficiently find the required complementary values.
- Ensures pairs are unique by checking existing solutions.

## How It Works

1. The input array is sorted using Quick Sort.
2. The highest valid index (<= Target Sum) is determined using Binary Search.
3. The array is truncated to ignore unnecessary elements.
4. The script iterates through the array, calculating the required pair value.
5. Binary search is used to check if the required pair exists.
6. The found pairs are stored and displayed.

## Example Execution

### Input:

```python
Array = [10,2,6,7,1,0,3,5,4,8,9]
Target_Sum = 10
Find_Pairs(Array, Target_Sum)
```

### Output:

```plaintext
[2, 8]
[3, 7]
[4, 6]
[0, 10]
[1, 9]
```

## Complexity Analysis

| Function               | Complexity     |
| ---------------------- | -------------- |
| Quick Sort             | O(N log N)     |
| Binary Search          | O(log N)       |
| Pair Finding           | O(N log N)     |
| **Overall Complexity** | **O(N log N)** |

## Author

Ahmed Ghaith

## Contact

A.wesam2300\@nu.edu.eg
