package com.kunal.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
//        for (int i = 0; i < 11; i++) {
//            System.out.println(Fibo(i));
//        }
        System.out.println(Fibonacci(50));
    }
    static long Fibonacci(long n ){
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int Fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }
}
