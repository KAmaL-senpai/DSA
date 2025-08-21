# Search in 2D Sorted Array

This Java program efficiently searches for a target value in a **2D matrix** where each row is sorted in ascending order. It uses a modified binary search technique to reduce the search space and quickly locate the target element.

---

## Features

- Handles matrices with multiple rows and columns.
- Optimized binary search that narrows down to two rows before searching columns.
- Throws an error if rows have inconsistent column sizes.
- Returns the position of the target as `[row, column]` or `[-1, -1]` if not found.

---

## How It Works

The algorithm first performs a binary search on the middle column to narrow down the candidate rows to two. Then, it checks the middle elements of those rows. If the target is not found, it divides the remaining search space into four quadrants and performs binary search on the relevant quadrant.

---

## Time and Space Complexity

-Time Complexity: O(log(rows) + log(cols))
-Space Complexity: O(1)
