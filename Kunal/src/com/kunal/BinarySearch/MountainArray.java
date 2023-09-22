package com.kunal.BinarySearch;

// Q: Find peak in Mountain Array :

public class MountainArray {
    public static void main(String[] args) {

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
                // you are in the ascending part of the array
                start = mid + 1;        // Because we know that mid + 1 > element , hence we are ignoring mid element

            }
        }
        // in the end , start == end and pointing to the largest number because of the above 2 checks
        // start and end are always trying to find the max element in the above 2 checks
        // Hence, when they are pointing to just one element, this is the max one because that is what the checks say.
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining,
        // hence because of above line that is the best possible answer
        return start;
    }
                         /// this is the code for finding peak of an array ///

}
