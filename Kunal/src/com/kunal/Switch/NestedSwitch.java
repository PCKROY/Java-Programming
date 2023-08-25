package com.kunal.Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

     // Correct way to do :

        switch (empID) {
            case 1 -> {
                System.out.println("Kunal Kushwaha");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    default -> System.out.println(" no department entered");
                }
            }
            case 2 -> {
                System.out.println("Rahul Rana");
                switch (department) {
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("no department entered");
                }
            }
            case 3 -> {
                System.out.println("Aryan Roy");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("Enter correct empID");
        }

        // Old switch way
//        switch (empID){
//            case 1 :
//                System.out.println("Kunal Kushwaha");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    default:
//                        System.out.println(" no department entered");
//                } break;
//
//            case 2 :
//                System.out.println("Rahul Rana");
//                switch (department){
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    default:
//                        System.out.println("no department entered");
//                } break;
//
//            case 3 :
//                System.out.println("Aryan Roy");
//                switch (department){
//                    case "IT":
//                        System.out.println("IT department");
//                        break;
//                    default:
//                        System.out.println("no department entered");
//                } break;
//
//            default:
//                System.out.println("Enter correct empID");
//        }
    }
}
