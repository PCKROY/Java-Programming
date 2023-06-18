
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // user input e scanner rules apply hobe. the number hole int. word hole string

        int maxValue = Integer.MIN_VALUE ;

        for (int  i = 1 ; i <= n ; i++ ) {
            int current = sc.nextInt();
            maxValue = Math.max(maxValue,current);
        }
        System.out.println(maxValue);
    }
}
