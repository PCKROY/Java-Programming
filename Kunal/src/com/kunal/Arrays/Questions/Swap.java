package com.kunal.Arrays.Questions;


import java.util.Arrays;

public class Swap {
    // swapping indexes inside the arrays

    public static void main(String[] args) {
        int[] arr = {1,3,56,8,888};
        swap(arr , 0,4);
        System.out.println(Arrays.toString(arr));       // answer will be {888, 3, 56, 8, 1}
    }

     static void swap(int[] arr , int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
