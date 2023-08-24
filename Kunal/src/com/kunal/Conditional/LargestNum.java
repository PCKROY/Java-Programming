package com.kunal.Conditional;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

     // Print the largest number of the given 3 numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//        if(b > max){
//            max = b;
//        } else if (c > max) {
//            max = c;
//        } else{
//            max = a;
//        }

        int max = Math.max(c,Math.max(a,b));        // 2nd method of doing the solution
        System.out.println(max);


    }
}
