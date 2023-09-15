package com.kunal.BinarySearch;

public class OrderAgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {-19, -2, 0, 2, 4, 5, 6, 18, 22, 33, 44, 55, 66};
        int target = -2;
        System.out.println(orderAgnosticBS(arr,target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc;                          // shortcut : boolean isAsc = arr[start] < arr[end] ;
        if(arr[start] < arr[end]){
            isAsc = true;
        } else {
            isAsc = false;
        }


        while(start <= end){
            // find the middle element
//            int mid = (start + end) / 2;      // might be possible that (start + end) exceeds the range of int.
            // best way to find mid is
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid; 
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                }

        }   return -1;
    }
}
