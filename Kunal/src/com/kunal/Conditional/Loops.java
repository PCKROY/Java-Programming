package com.kunal.Conditional;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop :
        /*
            Syntax of for loop :
            for(initialization , condition , increment/decrement) {
                    // body here
            }
         */

        // Q : Print the numbers from 1 to 5 :

//        for (int num = 1; num <=5 ; num++) {
//            System.out.println(num);
//        }

        // Q : Print the numbers from 1 to n ( take user input ) :
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <=n ; num++) {
////            System.out.print(num + " ");                // here it will print 1 to n numbers that is given by the user.
//            System.out.println("Hello World ! ");       // in this case, it will print given string how many times do user want it to print
//        }

        // while Loop :
        /*
            Syntax of while loop :
                while( condition ) {
                    // body here
                }
         */

        // Q : print numbers from 1 to 5 :
//        for (int num = 1; num <=5 ; num++) {          // For loop reference
//            System.out.println(num);
//        }

        int num = 1;
        while(num <=5){                     // here lies the condition 'num <= 5'
            System.out.println(num);      // here lies the body and the increment/decrement
            num++;
        }

        // Do while loop :
        /*
            Syntax of Do while loop :
            do {
                // body here
            } while(condition);
         */
//            int n = 1;
//            do{                                      // do while loop
//                System.out.println(n);
//                n++;
//            }while(n<=5);

    }
}
