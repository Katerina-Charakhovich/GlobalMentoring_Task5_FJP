# GlobalMentoring_Task5_FJP
# Description

## Task 1 (Optional) - Factorial via FJP

Cost: 1 point.

Use FJP to calculate factorial. Compare with the sequential implementation. Use BigInteger to keep values.

## Task 2 - Multithreading Sorting via FJP

Cost: 1 points.

Implement Merge Sort or Quick Sort algorithm that sorts huge array of integers in parallel using Fork/Join framework.


## Task 5 (prodcons module):

Solve producer–consumer problem

Cost: 1 points.

Using:

Semaphore
</br>
BlockingQueue
## Task 6

Cost: 1 points.

RecursiveTask

Give example from RecursiveTask javadoc.
Write FibonacciTask that implements RecursiveTask.
Apply suggestion from javadoc to check minimum granularity size less or equal 10. And in that case use linear algorithm.
Using unit test check that your code works correctly:
assertEquals(1134903170L, new ForkJoinPool().invoke(new FibonacciTask(45)).longValue());

RecursiveAction

Sum of double squares

Give last example from RecursiveAction javadoc about calculation of sum of squares in double[] array.
Use double array of half-billion size 500_000_000 filled by random doubles.
Compare speed with direct linear calculation (you may use Stream API as well):
double sum = 0; for (double v : ARRAY) { sum += v * v; }
