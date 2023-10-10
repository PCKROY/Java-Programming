package com.kunal.Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {0, -32, -2, 3, 89};
        int[] arr1 = {5, 3, 4, 1, 2};
        selection(arr);
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

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {                  // Selection Sorting
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

   static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
       for (int i = start; i <= end; i++) {
           if(arr[max] < arr[i]){
               max = i;
           }
       } return max;
    }
}
