package com.kunal.Conditional;

import java.util.Scanner;

public class CaseCheck {
    // Alphabet case check :
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        String word = "Hello";
//        System.out.println(word.charAt(4));

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
