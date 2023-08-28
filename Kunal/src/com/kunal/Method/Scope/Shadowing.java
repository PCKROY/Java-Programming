package com.kunal.Method.Scope;

public class Shadowing {
    static int x = 90;          // this will get shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x);          //  will print 90
        int x;      // the class variable at line 4 is shadowed by this.
//        System.out.println(x);        // Scope will begin when value is initialized
        x = 40;
        System.out.println(x);         // will print 40;
        fun();
    }

     static void fun() {
         System.out.println(x);
    }
}
