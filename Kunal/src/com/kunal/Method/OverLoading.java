package com.kunal.Method;

import java.util.Arrays;

public class OverLoading {
    public static void main(String[] args) {
        int ans = sum(20,30);
        System.out.println(ans);

        int ans2 = sum(20 ,30,10);
        System.out.println(ans2);

        demo("Kunal","Prokash","Aryan");
//        demo(2,3,5,6,2,45,23);
    }
    static int sum(int a , int b){
        return a + b;
    }
    static int sum(int a , int b ,  int c ){            //  same method got overloaded.
        return a + b + c;                              //   condition is, either method name or datatype or
                                                      //    parameters have to be changed to eligible.
    }

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }
}
