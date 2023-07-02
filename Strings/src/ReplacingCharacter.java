// Write a program to return a string from a given string s where all occurrences of
//the first char of the string except the first occurrence have been changed to '$'

import java.util.Scanner;
public class ReplacingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        for(int i = 1; i < ch.length; i++) {    // by starting at index 1, loop will see if another char of same 0 index
            if(ch[i] == ch[0]) {                // is present or not in ch.length. if found then the char will be changed to $
                ch[i] = '$';
            }
        }

        String output = new String(ch);        // charArray has changed to String.
        System.out.println(output);


    }
}

