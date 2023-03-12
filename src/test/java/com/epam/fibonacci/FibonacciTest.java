package com.epam.fibonacci;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.concurrent.ForkJoinPool;

import static junit.framework.TestCase.assertEquals;

public class FibonacciTest {
    @Test
    public void fibonacciTest() {
        assertEquals(1134903170L, new ForkJoinPool().invoke(new Fibonacci(45)).longValue());
        }
    }
