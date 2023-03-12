package com.epam.fibonacci;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<BigInteger> {
    private long number;
    private final Map<Long, BigInteger> cache;

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    public Fibonacci(long number) {
        this.number= number;
        this.cache = new HashMap<>();
        cache.put(0L, BigInteger.valueOf(0L));
        cache.put(1L, BigInteger.valueOf(1L));
        cache.put(2L, BigInteger.valueOf(1L));
        cache.put(3L, BigInteger.valueOf(2L));
        cache.put(4L, BigInteger.valueOf(3L));
        cache.put(5L, BigInteger.valueOf(5L));
        cache.put(6L, BigInteger.valueOf(8L));
        cache.put(7L, BigInteger.valueOf(13L));
        cache.put(8L, BigInteger.valueOf(21L));
        cache.put(9L, BigInteger.valueOf(34L));
    }

    @Override
    protected BigInteger compute() {
        BigInteger result = cache.get(number);
        if (result != null) {
            return result;
        }
        Fibonacci f1 = new Fibonacci(number - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(number - 2);
        return f2.compute().add(f1.join());
    }
}