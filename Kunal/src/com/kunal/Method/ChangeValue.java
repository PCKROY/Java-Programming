package com.kunal.Method;

import java.sql.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
        fun(2,3,4,5,6,7,89,0);
    }

    static void fun(int a, int b,int...v) {                          // varargs method
        System.out.println(Arrays.toString(v));
    }

    static void change(int[] arr) {
            arr[0] = 99; // if we make a change to the object via this ref. variable, same object will be changed
    }
}
