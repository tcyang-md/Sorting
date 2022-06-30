# Sorting
This program is written in **java** and is a quick exercise demonstrating the time complexity of **bubble sort**, **insertion sort**, **selection sort**, **merge sort**, *quick sort**, and optimized version of **quick sort** on a randomized or ordered array of `n` integers.

## Instructions
```
$ javac Sorting.java
$ java Sorting.java
```

## Breakdown
All of the names of the functions are self-explanatory besides `QuickSortOptimized` which has two optimizations
- for arrays below 10 integers, insertion sort is used instead
- randomizes integers in the array to prevent worst-case performance of quick sort on an already sorted array
``` java
public static void BubbleSort(long[] a)
public static void InsertionSort(long[] a)
public static void SelectionSort(long[] a)

// mergesort with helper methods
public static void MergeSort(long[] a)
private static void sort(long[] a, long[] aux, int lo, int hi) {
private static void merge(long[] a, long[] aux, int lo, int mid, int hi)

// recursive quick sort and helper methods
public static void QuickSort(long[] a)
private static void QuickSort(long[] a, int left, int right) {
private static int partition(long[] a, int left, int right, int pIdx)

// optimized recursive quick sort
public static void QuickSortOptimized(long[] a)
private static void QuickSortOptimized(long[] a, int left, int right)
public static void shuffle(long[] a)

public static void MergeSortNonRec(long[] a)
```

## Example
```
$ java Sorting.java
Running Bubble Sort ...done.
Running Selection Sort ...done.
Running Insertion Sort ...done.
Running Quicksort...done.
Running Optimized Quicksort...done.
Running MergeSort Recursive ...done.
Running MergeSort Non Recursive ...done.

Average running time:
N        BubbleSort     SelectionSort   InsertionSort   QuickSort       QuickSortOpt    MergeSortRec    MergeSortNonRec
2         0.0011          0.0016          0.0024          0.0024          0.2019          0.0025          0.0021          
4         0.0002          0.0006          0.0002          0.0009          0.0028          0.0010          0.0006          
8         0.0003          0.0013          0.0003          0.0022          0.0217          0.0022          0.0006          
16        0.0004          0.0062          0.0004          0.0162          0.0389          0.0108          0.0011          
32        0.0006          0.0173          0.0007          0.1013          0.0391          0.0114          0.0019          
64        0.0012          0.0467          0.0049          0.0482          0.0780          0.0315          0.0041          
128       0.0022          0.1534          0.0060          0.0787          0.1011          0.0520          0.0078          
256       0.0043          0.2942          0.0050          0.3536          0.0667          0.0332          0.0147          
512       0.0083          0.8767          0.0120          0.4337          0.0806          0.0661          0.0296          
1024      0.0210          0.5911          0.0225          0.1821          0.1621          0.1138          0.0599          
2048      0.0563          0.5280          0.0393          0.5794          0.3403          0.3553          0.1238          
4096      0.2579          2.0638          0.0744          2.4748          0.4619          0.5476          0.2413          
8192      0.1867          10.1060         0.1739          9.6607          0.9973          0.8002          0.5082          
16384     0.1203          36.0637         0.1023          36.9175         1.7269          0.6208          0.7950 
```
