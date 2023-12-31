package com.kunal.BinarySearch;

// Position of an element in infinity Sorted array:

public class InfinityArray {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 190, 210, 220, ......................};
//        int target = 100;                         // answer will show 6
//        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        // first find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // condition for the target to0 lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double the box value
            // end = previous end + size of the box * 2

            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            // find the middle element
//            int mid = (start + end) / 2;      // might be possible that (start + end) exceeds the range of int.
            // best way to find mid is
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                return mid;
            }
        } return -1;
    }
}
