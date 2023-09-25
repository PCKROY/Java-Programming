package com.kunal.BinarySearch;

public class NoCountRBS {
    public static void main(String[] args) {
            int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
            System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // if we don't have duplicate values, we can use this way to find the pivot
   static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;                                    // Case 1
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;                               //  Case 2
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;                                   // Case 3
            } else {
                start = mid + 1;                                // Case 4
            }
        }
        return -1;
    }


    // if we have duplicate values, have to use this way to find pivot
   static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;                                    // Case 1
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;                               //  Case 2
            }
            // if elements at middle , start , end, are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // NOTE : What if these elements at start and end were the pivots?

                //  check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // check if end is pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right side
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
