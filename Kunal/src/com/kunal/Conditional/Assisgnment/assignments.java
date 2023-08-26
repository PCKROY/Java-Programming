package com.kunal.Conditional.Assisgnment;

public class assignments {
    // Sum of A DIGITS of Number
    public static void main(String[] args) {
        int n = 234567890;
        int sum = 0;

        while(n > 0){
           int rem = n % 10;
           sum = sum + rem;

           n /= 10;
        }
        System.out.println(sum);
    }
}
