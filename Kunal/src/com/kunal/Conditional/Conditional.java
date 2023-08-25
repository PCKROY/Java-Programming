package com.kunal.Conditional;

public class Conditional {
    public static void main(String[] args) {
        /*
           Syntax of if conditional statements :
                if (boolean expression T or F) {
                // body
             }  else {
                // do this
             }
        */

        int salary = 17500;
//          if ( salary > 10000 ){
//            salary = salary + 2000;
//        } else {
//              salary = salary + 3000;
//          }

        // Multiple if-else statements :

        if ( salary < 15000){
            salary += 3000;         // salary = salary + 3000;
        } else if (salary > 15000) {
            salary += 2500;
        } else if (salary > 20000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}
