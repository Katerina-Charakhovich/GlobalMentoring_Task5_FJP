package com.epam.factorial;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFactorial extends RecursiveTask<BigInteger> {
    private BigInteger number;

    public ForkJoinFactorial(BigInteger number) {
        this.number = number;
    }

    @Override
    protected BigInteger compute() {
        if (number.compareTo(BigInteger.valueOf(1)) <= 0) {
            return number;
        }
        ForkJoinFactorial subtask = new ForkJoinFactorial(number.subtract(BigInteger.ONE));
        subtask.fork();
        return number.multiply(subtask.join());
    }

    public static BigInteger calculate(BigInteger num) {
        ForkJoinFactorial task = new ForkJoinFactorial(num);
        return (new ForkJoinPool()).invoke(task);
    }
}
