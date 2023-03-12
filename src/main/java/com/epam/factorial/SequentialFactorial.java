package com.epam.factorial;

import java.math.BigInteger;

public class SequentialFactorial {
   public static BigInteger calculate(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(2)) <= 0) {
            return n;
        }
        return n.multiply(calculate(n.subtract(BigInteger.ONE)));
    }
}
