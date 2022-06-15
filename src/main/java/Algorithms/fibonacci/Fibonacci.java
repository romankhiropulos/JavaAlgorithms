package Algorithms.fibonacci;

import java.math.BigInteger;

/**
 * Sequence of Fibonacci - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233...
 */
public class Fibonacci {

    /**
     * @param N - number of member Fibonacci
     * @return
     */
    public static int getMemberOfFibonacciRecursive(int N) {
        if (N < 2) {
            return N;
        }
        return getMemberOfFibonacciRecursive(N - 1) + getMemberOfFibonacciRecursive(N - 2);
    }

    static BigInteger getMemberOfFibonacciFast(int member) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c;
        for (int i = 0; i < member; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.getMemberOfFibonacciRecursive(5));
        System.out.println(Fibonacci.getMemberOfFibonacciFast(5));
    }
}
