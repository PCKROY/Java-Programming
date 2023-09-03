package com.kunal.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array of Primitive
        int[] arr = new int[5];
         arr[0] = 21;
         arr[1] = 20;
         arr[2] = 19;
         arr[3] = 43;
         arr[4] = 44;
      // {21,20,19,43,44}
        System.out.println(arr[0]);

    // Input using for loop:

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));           // the best way to represent array

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // for each method to represent array
//        for(int num : arr){             //  for every element in array, print the element
//            System.out.print(num);  // Here, num represents elements of the array.
//      }

        // Array of object

        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
              str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Modify
        str[1] = "kunal";

        System.out.println(Arrays.toString(str));

    }
}
