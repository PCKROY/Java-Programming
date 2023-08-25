package com.kunal.Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println("King of the fruits");
//            break;
//            case "Strawberry":
//                System.out.println("A sour red fruit");
//            break;
//            case "Orange":
//                System.out.println("A medium round sized fruit");
//            break;
//            case "Nashpati":
//                System.out.println("A white colored fruit");
//            break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }


//        switch (fruit) {                                                 // Enhanced switch cases, don't require break
//            case "Mango" -> System.out.println("King of the fruits");
//            case "Strawberry" -> System.out.println("A sour red fruit");
//            case "Orange" -> System.out.println("A medium round sized fruit");
//            case "Nashpati" -> System.out.println("A white colored fruit");
//            default -> System.out.println("please enter a valid fruit");
//        }
        int day = in.nextInt();
//        switch (day){
//           case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
        switch (day) {
            case 1, 2, 3, 4 -> System.out.println("Weekdays");
            case 5, 6, 7 -> System.out.println("Weekend");
        }


    }
}
