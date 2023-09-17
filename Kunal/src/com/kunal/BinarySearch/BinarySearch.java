package com.kunal.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-19, -2, 0, 2, 4, 5, 6, 18, 22, 33, 44, 55, 66};
        int target = -2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return index
    // return -1 if target does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
                // ans found
                return mid;
            }
        } return -1;
    }
}
