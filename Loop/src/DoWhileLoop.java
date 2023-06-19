 import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        do {
            num = sc.nextInt();
            sum += num;

        } while (num >= 0);
        System.out.println(" sum = " + sum);
        



    }

}
