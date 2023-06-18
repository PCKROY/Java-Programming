
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();

       int b =sc.nextInt();

       int c = sc.nextInt();

       if (a == b || b == c || a == c){
           System.out.println("isosceles");
       }else if ( a == b && a==c) {
           System.out.println("equilateral");
       } else {
           System.out.println("scalen");
       }



// source tree ashe na ken

















    }
}
