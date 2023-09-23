package com.kunal.BinarySearch;

// Q: Find in Mountain Array ( LeetCode Hard ) :

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = PeakIndexMountainArray(arr);
        int FirstTry = orderAgnosticBS(arr, target, 0, peak);
        if(FirstTry != -1){
            return FirstTry;
        }
        // try to search in second half:
        return orderAgnosticBS(arr,target, peak+1, arr.length - 1);
    }

    static int PeakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //you are in the decreasing part of array
                // this may be the ans, but look at the left
                // this is why end != mid - 1;
                end = mid;
            } else{
                start = mid + 1;

            }
        }

        return start;
    }
                        /// this is the code for finding peak of an array ///


    static int orderAgnosticBS(int[] arr, int target, int start, int end){
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
