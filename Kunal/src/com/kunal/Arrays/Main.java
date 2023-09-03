package com.kunal.Arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,22,33,55};
        System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));


//        int r = 10;
//        String name = "Kunal";

        // Q: store 5 roll numbers
        // syntax :

        // datatype[] variable_name = new datatype[size];               // how to write an array

        // int[] rnos = new int[5];
        // or,
        // int[] rno2 = {23,24,5,67,74};

//        int[] rnos ;   // declaration of array, rnos is getting defined in the stack
//        rnos = new int[5];   // initialization : actually the object is being created int the heap memory
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
