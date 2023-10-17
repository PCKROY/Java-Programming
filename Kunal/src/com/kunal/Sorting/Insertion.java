package com.kunal.Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {0, -32, -2, 3, 89};
        int[] arr1 = {5, 3, 4, 1, 2};
        insertion(arr);
        insertion(arr1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {                 // Insertion Sorting
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j - 1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
