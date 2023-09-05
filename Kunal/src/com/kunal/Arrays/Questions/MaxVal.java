package com.kunal.Arrays.Questions;



public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {34, 56, 4, 89, 0};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1,3));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
