import java.util.Scanner;
public class Sqfrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] sq = new int[N];
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            sum = i * i;
            sq[i - 1] = sum;

        }
        for (int i : sq) {    /// arrays statement print
            System.out.print(i + " ");
        }
    }
}
