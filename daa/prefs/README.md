# DAA Practice Programs

This folder contains 72 Java practice programs grouped by topic. Use the folder guide to find a problem, then follow the study route below to build concepts in order. Existing Java source files are listed as they are; this README does not imply that every exercise is a complete or tested solution.

## Folder Guide and File Inventory

### `arrays/`
Array fundamentals, search and sort techniques, classic array problems, and divide-and-conquer examples.

- `basics/` - Array aggregation
  - [SumArray.java](arrays/basics/SumArray.java) - Sum elements recursively
  - [SumArrayIter.java](arrays/basics/SumArrayIter.java) - Sum elements iteratively
- `searching/` - Binary search and related sorted-array problems
  - [BinarySearch.java](arrays/searching/BinarySearch.java) - Iterative binary search
  - [RBinarySearch.java](arrays/searching/RBinarySearch.java) - Recursive binary search
  - [BoundaryInsertionPoint.java](arrays/searching/BoundaryInsertionPoint.java) - Find a target or its insertion position
  - [TargetRange.java](arrays/searching/TargetRange.java) - Find the first and last target positions
  - [FixedPoint.java](arrays/searching/FixedPoint.java) - Find an index equal to its value
  - [RFixedPoint.java](arrays/searching/RFixedPoint.java) - Recursive fixed-point search
  - [BinaryMin.java](arrays/searching/BinaryMin.java) - Find the minimum in a rotated sorted array
  - [SmallestCommonElement.java](arrays/searching/SmallestCommonElement.java) - Find a common element in sorted arrays
  - [KokoBanana.java](arrays/searching/KokoBanana.java) - Binary search over a feasible rate
  - [MedianSortedArrays.java](arrays/searching/MedianSortedArrays.java) - Find the median of two sorted arrays
- `sorting/` - Sorting algorithms and merge/partition operations
  - [QuickSortPartition.java](arrays/sorting/QuickSortPartition.java) - Partition an array around a pivot
  - [QuickSort.java](arrays/sorting/QuickSort.java) - Quick sort
  - [MergeSortedArrays.java](arrays/sorting/MergeSortedArrays.java) - Merge two sorted arrays
  - [MergeSort.java](arrays/sorting/MergeSort.java) - Merge sort
- `problems/` - Common array interview problems
  - [TwoSum.java](arrays/problems/TwoSum.java) - Find a pair that reaches a target
  - [SortedPairLocator.java](arrays/problems/SortedPairLocator.java) - Two pointers on a sorted array
  - [BestTime.java](arrays/problems/BestTime.java) - Best single stock transaction
  - [MajorityElement.java](arrays/problems/MajorityElement.java) - Element occurring more than half the time
  - [MajorityElement2.java](arrays/problems/MajorityElement2.java) - Elements occurring more than one third of the time
  - [KthLargest.java](arrays/problems/KthLargest.java) - Find the kth largest element
  - [MaxContin_sum.java](arrays/problems/MaxContin_sum.java) - Maximum contiguous subarray sum
- `divide-and-conquer/` - Divide-and-conquer minimum/maximum examples
  - [DCMaxMin.java](arrays/divide-and-conquer/DCMaxMin.java) - Find minimum and maximum with divide and conquer
  - [DualEndMetric.java](arrays/divide-and-conquer/DualEndMetric.java) - Find minimum and maximum recursively

### `math/`
Number-focused recursion and iteration exercises. Paired versions are listed together.

- [Fact.java](math/Fact.java) and [FactIter.java](math/FactIter.java) - Factorial, recursive and iterative
- [Fib.java](math/Fib.java) and [FibIter.java](math/FibIter.java) - Fibonacci, recursive and iterative
- [GCD.java](math/GCD.java) and [GCDIter.java](math/GCDIter.java) - GCD, recursive and iterative
- [SumN.java](math/SumN.java) and [SumNIter.java](math/SumNIter.java) - Sum of the first n numbers, recursive and iterative
- [HappyRec.java](math/HappyRec.java) and [HappyIter.java](math/HappyIter.java) - Happy-number check, recursive and iterative
- [RDigitSum.java](math/RDigitSum.java) - Recursive digit sum
- [Power.java](math/Power.java) - Calculate an integer power

### `strings/`
String manipulation, prefix matching, validation, and rotational-number problems.

- [ReverseString.java](strings/ReverseString.java) and [RReverseString.java](strings/RReverseString.java) - Reverse a string iteratively and recursively
- [CommonSubString.java](strings/CommonSubString.java) - Find the common prefix described by the exercise
- [ValidParentheses.java](strings/ValidParentheses.java) - Validate matching parentheses
- [StrobogrammaticNumber.java](strings/StrobogrammaticNumber.java) - Check a strobogrammatic number
- [Strobogrammatic2.java](strings/Strobogrammatic2.java) - Generate strobogrammatic numbers

### `matrices/`
Basic matrix arithmetic.

- [MatAdd.java](matrices/MatAdd.java) - Matrix addition
- [MatMul.java](matrices/MatMul.java) - Matrix multiplication

### `intervals/`
Interval sorting and merging.

- [OverLapMaintainance.java](intervals/OverLapMaintainance.java) - Merge overlapping maintenance intervals

### `greedy/`
Greedy-choice exercises involving coins, knapsack, and array products.

- [NoOfCoins.java](greedy/NoOfCoins.java) - Minimum coins for the listed denominations
- [GreedyKnapsack.java](greedy/GreedyKnapsack.java) - Knapsack-style cost maximization
- [MinProductSubset.java](greedy/MinProductSubset.java) - Find a minimum-product subset

### `dynamic-programming/`
Climbing-stairs implementations to compare recursive and iterative approaches.

- [ClimbStairs.java](dynamic-programming/ClimbStairs.java) - Recursive climbing-stairs count
- [ClimbStairsIter.java](dynamic-programming/ClimbStairsIter.java) - Iterative climbing-stairs count
- [ClimbingStairs.java](dynamic-programming/ClimbingStairs.java) - Climbing-stairs problem variant

### `trees/`
Binary-tree traversal and hierarchy problems.

- [BinaryLevelOrder.java](trees/BinaryLevelOrder.java) - Level-order traversal
- [LonelyNodes.java](trees/LonelyNodes.java) - Find nodes without siblings
- [MaxDepthDFS.java](trees/MaxDepthDFS.java) - Find hierarchy depth using DFS
- [BoundaryOfBinaryTree.java](trees/BoundaryOfBinaryTree.java) - Binary-tree boundary traversal

### `graphs/`
Graph representations, traversals, grid searches, spanning trees, and shortest paths.

- `representation/` - [AdjacencyMatrix.java](graphs/representation/AdjacencyMatrix.java) and [AdjacencyList.java](graphs/representation/AdjacencyList.java)
- `traversal/` - [BFSFirst.java](graphs/traversal/BFSFirst.java), [BFS.java](graphs/traversal/BFS.java), [DFSFirst.java](graphs/traversal/DFSFirst.java), [DFS.java](graphs/traversal/DFS.java)
- `grid-search/` - [FloodFillLC.java](graphs/grid-search/FloodFillLC.java), [TotalNumberOfIslands.java](graphs/grid-search/TotalNumberOfIslands.java), [NumberOfIslandsDFS.java](graphs/grid-search/NumberOfIslandsDFS.java), [MaxArea_BFS.java](graphs/grid-search/MaxArea_BFS.java), [MazArea_DFS.java](graphs/grid-search/MazArea_DFS.java), [Maze.java](graphs/grid-search/Maze.java), [Maze_Using_stack.java](graphs/grid-search/Maze_Using_stack.java)
- `spanning-trees/` - [KruskalsAlgorithm.java](graphs/spanning-trees/KruskalsAlgorithm.java), [PrimsAlgorithm.java](graphs/spanning-trees/PrimsAlgorithm.java)
- `shortest-path/` - [ShortestPaths.java](graphs/shortest-path/ShortestPaths.java)

## Recommended Solving Order

Work through the folders in this order. Within each folder, follow the file order above; paired recursive and iterative versions are placed together so you can compare them.

1. **Foundations:** `arrays/basics/`, then `math/`. Start with array sums and basic number problems; compare each recursive version with its iterative counterpart.
2. **Basic data handling:** `strings/`, then `matrices/`. Practice transformations and simple structures before applying more involved algorithms.
3. **Array techniques:** `arrays/searching/`, then `arrays/sorting/`, then `arrays/problems/`. This builds from binary search and sorting into problems that reuse those patterns.
4. **Algorithm strategies:** `arrays/divide-and-conquer/`, then `intervals/`, then `greedy/`.
5. **Dynamic programming:** `dynamic-programming/`. Compare the climbing-stairs variants after the recursion and iteration practice in `math/`.
6. **Trees:** `trees/`. Learn level-order traversal and then solve hierarchy problems.
7. **Graphs:** Start with `graphs/representation/`, continue to `graphs/traversal/`, then `graphs/grid-search/`, `graphs/spanning-trees/`, and finish with `graphs/shortest-path/`.

## Adding Programs

Place new programs in the closest existing topic folder. If a topic grows, add a descriptive subfolder and update this inventory and solving route. Java source roots are listed in the workspace [settings](../../.vscode/settings.json); add any new leaf source folder there so VS Code continues to treat these files as default-package programs without requiring edits to their contents.
