//Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.
//
//        In one wish, Mr Jim can perform one of the following operations:
//        Remove exactly one occurrence of 'p' and exactly one occurrence of 'm', from anywhere inside string A.
//        Remove exactly one occurrence of 'a' and exactly one occurrence of 'm', from anywhere inside string A.
//        Now Mr. Jim wants to know if after some number of wishes is it possible to make string A empty.
//
//        Return 1 if it is possible to make string A empty after some number of operations otherwise Return 0

import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }


        public static int paraphase (String s){
            char[] ch = s.toCharArray();
            int num_of_p = 0;
            int num_of_a = 0;
            int num_of_m = 0;

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'p') {
                    num_of_p++;
                } else if (ch[i] == 'a') {
                    num_of_a++;
                } else if (ch[i] == 'm') {
                    num_of_m++;
                } else {
                    break;
                }
            }

            if (num_of_p % 2 == 0 && num_of_a == 0) {
                if (num_of_m == 2 * num_of_p) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return 0;


        }

}