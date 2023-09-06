package com.kunal.LinearSearch;

import static java.lang.Integer.MAX_VALUE;

public class TargetNum {
    public static void main(String[] args) {
        int[] nums = {21, 14, 22, 45, 67, 90, 9,};
        int target = 67;
        int ans = LinearSearch(nums, 67);
        System.out.println(ans);
    }

    // search the target and return the index:
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for a loop
        for (int index = 0; index < arr.length; index++) {
            // check for the element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the above return statement have executed
        // hence the target not found
        return MAX_VALUE;
    }


    // search the target and return the element:
    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run for a loop
        for (int element : arr) {
            // check for the element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the above return statement have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search the target and return the true or false statement:
    static boolean LinearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run for a loop
        for (int element : arr) {
            // check for the element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the above return statement have executed
        // hence the target not found
        return false;
    }
}

