package com.kunal.Sorting.InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] arr) {
            int i = 0;
            while(i < arr.length){
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }else{
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
        for (int Index = 0; Index < arr.length; Index++) {
            if(arr[Index] != Index + 1){
                ans.add(arr[Index]);
            }
        }
        return ans;

    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
