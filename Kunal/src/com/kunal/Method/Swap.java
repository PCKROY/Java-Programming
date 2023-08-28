package com.kunal.Method;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swapping numbers :
//        int temp = a;
//        a = b;                      // simple code for swapping numbers
//        b = temp;

        swap(a , b);
        System.out.println(a + " " + b);

        String name = "Kunal";
        ChangeName(name);
        System.out.println(name);
    }

     static void ChangeName(String name) {
        name = "Prokash";
    }

    static void swap(int a ,  int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
