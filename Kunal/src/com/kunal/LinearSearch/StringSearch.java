package com.kunal.LinearSearch;


import java.util.Arrays;

public class StringSearch {
    public static void main(String[] args) {
        String str = "Prokash";
        char target = 's';
        System.out.println(search(str,target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

     static boolean search(String str, char target) {
        if(str.length() == 0){
            return false;
        }
         for (int i = 0; i < str.length(); i++) {
             if(target == str.charAt(i)){
                 return true;
             }
         }
         return false;
    }

    // To show the characters in the char array format:
    static boolean search2(String str , char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
