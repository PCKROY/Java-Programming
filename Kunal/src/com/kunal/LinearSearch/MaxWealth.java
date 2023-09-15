package com.kunal.LinearSearch;

//LeetCode Easy: richest customer wealth
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 6, 8},
                {3, 3, 9}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts){
        // person = row;
        // accounts = col;
        int overallAns = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if(sum > overallAns){
                overallAns = sum;
            }
        } return overallAns;
    }
}
