package com.kunal.Method;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String call = greetings();
//        System.out.println(call);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.next();
        String call = myGreet(name);        // user define way. otherwise have to give a name to execute
        System.out.println(call);
    }

     static String myGreet(String name) {
        String message = "Hey " + name + " What's Up. How are you doing? ";
        return message;
    }
//    static String greetings(){
//       String greet =  "Hey,What's Up boi. How are you doing?";
//        return greet;
//    }


}
