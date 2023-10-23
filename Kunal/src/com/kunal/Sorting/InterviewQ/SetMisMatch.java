package com.kunal.Sorting.InterviewQ;

public class SetMisMatch {
    public static void main(String[] args) {

    }
    public int[] findErrorNums(int[] arr) {
            int i = 0;
            while(i < arr.length){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i ,correctIndex);
                }else {
                    i++;
                }
            }

            // search for first missing number
        for (int Index = 0; Index < arr.length; Index++) {
            if(arr[Index] != Index + 1){
                return new int[]{arr[Index], Index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
