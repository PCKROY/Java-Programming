package com.kunal.Arrays;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(2);
        list.add(50);
        list.add(44);
        list.add(52);
        list.add(21);

        System.out.println(list.contains(44));
        System.out.println(list);

        list.set(2,40);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

    }
}
