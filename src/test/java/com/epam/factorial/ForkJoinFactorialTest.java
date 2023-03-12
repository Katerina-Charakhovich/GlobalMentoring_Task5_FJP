package com.epam.factorial;
import org.junit.Test;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinFactorialTest {

    @Test
    public void fibonacciFJPTest() {
        long start = System.nanoTime();
        System.out.println(new ForkJoinPool().invoke(new ForkJoinFactorial(new BigInteger(String.valueOf(154)))));
        long end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds for FJP");
    }
    @Test
    public void fibonacciSequentialTest() {
        long start = System.nanoTime();
        System.out.println(SequentialFactorial.calculate(new BigInteger(String.valueOf(154))));
        long end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds for for sequential calculations");
    }
}