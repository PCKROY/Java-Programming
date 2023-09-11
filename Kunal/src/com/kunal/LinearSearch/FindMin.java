package com.kunal.LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23, 24, 50, 67, 89, 12};
        System.out.println(min(arr));
    }
    // assuming arr.length != 0
    // return the minimum value in the array
     static int min(int[] arr) {
         int ans = arr[0];
         for (int i = 1; i < arr.length ; i++) {
             if(arr[i] < ans){
                 ans = arr[i];
             }
         }
         return ans;
    }
}
