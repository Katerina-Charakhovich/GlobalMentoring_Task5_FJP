package com.epam.sumofsquares;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class SumOfSquaresTest {
    static int size = 500000000;
    static double[] array = new double[size];

    @BeforeClass
    public static void init() {
        System.out.println("Init");
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = r.nextDouble();
        }
    }

    @Test
    public void sumOfSquaresFJPTest() {
        long start = System.nanoTime();
        SumOfSquares sumOfSquaresAction = new SumOfSquares(array, 0, size, null);
        new ForkJoinPool().invoke(sumOfSquaresAction);
        System.out.println("Sum of Squares for FJP:" + sumOfSquaresAction.result);
        long end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds for FJP");
    }

    @Test
    public void sumOfSquaresTest() {
        long start = System.nanoTime();
        double sum = 0;
        for (double v : array) {
            sum += v * v;
        }
        System.out.println("Sum of Squares for sequential calculations:" + sum);
        long end = System.nanoTime();
        System.out.println((end - start) + " nanoseconds for for sequential calculations");
    }
}