package com.kunal.Sorting.InterviewQ;
import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in Google
public class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // just find the missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int Index = 0; Index < nums.length; Index++) {
            if(nums[Index] != Index + 1){
                ans.add(Index + 1);
            }
        }
        return ans;
    }
        void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }
}
