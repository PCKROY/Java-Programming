package com.kunal.Method.Scope;

public class scoop {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name  = "Kunal";
        {
//            int a = 78    // already initialized outside the block in the same
            a = 100;       // reassign the OG ref variable to some other value
            name = "Prokash";
//            System.out.println(a);
//            System.out.println(name);
            int c = 98;
            // values initialized in this block , will remain in this block
        }
        int c = 990;
        System.out.println(a);            // Changing values in the block will change the OG one
        System.out.println(name);
//        System.out.println(c);        // can't use outside the block

        // Scoping in for loos :
        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println(a);




    }

    static void excel (int mark){                  // it's called function scope
        int num = 67;                             // can't use num,mark in PSVM method or in other method
        System.out.println(num);
        System.out.println(mark);                 // num,mark can only be used at this function.
    }
}
