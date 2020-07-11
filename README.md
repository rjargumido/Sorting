# Sorting Benchmarking Program in Java
Benchmarking program in Java for different sorting algorithms.

The main method is present at **[SortingBenchmarker.java](https://github.com/rjargumido/SortingBenchmark/blob/master/src/SortingBenchmarker.java)**. It displays the average runtime per sorting method based on the number of experiments (*NUM_EXPERIMENTS*) in nanoseconds per runs (*RUNS*).**[GeneratorSortingInput.java](https://github.com/rjargumido/SortingBenchmark/blob/master/src/GeneratorSortingInput.java)** generates the **[SortingInput.txt](https://github.com/rjargumido/SortingBenchmark/blob/master/SortingInput.txt)** used by the SortingBenchmarking program.

This benchmarking program has the following Java sorting programs:

1. *[BinarySort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/BinarySort.java)*
2. *[BucketSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/BucketSort.java)*
3. *[HeapSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/HeapSort.java)*
4. *[InsertionSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/InsertionSort.java)*
5. *[MergeSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/MergeSort.java)*
6. *[QuickSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/QuickSort.java)*
7. *[SelectionSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/SelectionSort.java)*
8. *[ShellSort](https://github.com/rjargumido/SortingBenchmark/blob/master/src/ShellSort.java)*

Following is a sample benchmark of ***BucketSort*** and ***InsertionSort*** using the following test case on July 11, 2020 13:38:41 Philippine Standard Time:
**Test case:**

| **Description** | **Value** |
| ------------- | ------------- |
| Value range | -128 to 127 |
| Total number of values | 3,913,539 |
| Number of iterations made (per run) |	50 |
| Average runtime duration per run | in nanoseconds|
| Number of runs | 20 |

Using a x64-bit Operating System in a x64-based processor (Intel(R) Core(TM) i7-7500U CPU @ 2.70GHz 2.90 Ghz) 


![Speed comparison between BucketSort and InsertionSort in bar graph representation](https://github.com/rjargumido/SortingBenchmark/blob/master/_bar.PNG)

![Speed comparison per run between BucketSort and InsertionSort in line graph representation](https://github.com/rjargumido/SortingBenchmark/blob/master/_line.PNG)
