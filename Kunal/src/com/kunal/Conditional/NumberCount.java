package com.kunal.Conditional;

public class NumberCount {
    public static void main(String[] args) {

        // N = 1385757879       // how many times 7 has been called?

        int n = 1385757879;
        int count = 0;
        while (n > 0){
          int  rem = n % 10;
          if (rem == 7){
              count++;
          }
            n /= 10;            // n = n / 10; same
        }
        System.out.println(count);


    }
}
