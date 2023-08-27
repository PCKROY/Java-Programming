package com.kunal.Conditional.Assisgnment;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        float PI = 3.1416f;

        float perimeter = ( 2 * PI * r);
        System.out.println(perimeter);

    }
}
