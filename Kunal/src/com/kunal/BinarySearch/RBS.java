package com.kunal.BinarySearch;

// Search In Rotated Sorted Array :

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
//        System.out.println(findPivot(arr));
    }

    int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot , it means that the array is not rotated
        if (pivot == -1) {
            // just do the normal Binary Search

            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // if you find pivot , you have found 2 ascending sorted arrays
        if (nums[pivot] == target) {                                                 // For answer its Case 1
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;      // might be possible that (start + end) exceeds the range of int.
            // best way to find mid is
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }


    int findPivot(int[] arr) {
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
}
