package com.kunal.Method.Questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));          // User input to show whether the number is Armstrong or not

        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(i)){                     // it is for showing how many armstrong number is present there.
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;                       // 153,370,371,407  are the only Armstrong numbers within 100-1000
        int sum = 0;

        while(n > 0){
           int rem = n % 10;
           sum = sum + rem*rem*rem;
           n = n / 10;
        }
        return sum == original;
    }
}
