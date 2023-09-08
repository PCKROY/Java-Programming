package com.kunal.LinearSearch;

public class SearchinRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 14, 17, 24, 48, 90, 21, 144};
        int target = 21;
        System.out.println(linearSearch(arr,target,4,8));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index < end; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }  return -1;
    }
}
