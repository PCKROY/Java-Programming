package com.kunal.LinearSearch;

// LeetCode Easy question :
// Given an array numbers of integers, return how many of them contain an Even Number of digits:
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 5, 7, 7896};
//        System.out.println(findNumbers(arr));
        System.out.println(digits2(-123334));
    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num : arr){
            if(even(num)){
                count++;
            }
        } return count;
    }

    // function to check whether a number contains even digits or not
     static boolean even(int num) {
            int NumOfDigits = digits(num);
            if (NumOfDigits % 2 == 0){
                return true;                  // shortcut: return NumOfDigits % 2 == 0 ;
            }
            return false;
    }
    // Shortcut way to find the digit:
    static int digits2(int num){
        if (num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;     // fastest way to do the solution of this.(95% faster than others)
    }

    //  count number of digits in a number
    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
