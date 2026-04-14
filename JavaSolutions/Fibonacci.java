package com.learnjavafromalgomaster;

public class Fibonacci {
    private static long[] fibonacciCache;

    public static long fibonacci(int n){

        if (fibonacciCache == null) {
            fibonacciCache = new long[n + 1];
        }

        if (n <= 1) {
            fibonacciCache[n] = n;
            return n;
        }

        if(fibonacciCache[n]!=0) return fibonacciCache[n];
        long nthFibonacciNumber =  fibonacci(n-1) + fibonacci(n-2);
        fibonacciCache[n] = nthFibonacciNumber;
        return  nthFibonacciNumber;
    }
}
