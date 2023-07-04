import java.util.Scanner;
public class MatrixTranspose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        int[][] sum = solve(arr);

        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[0].length; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] arr) {
        int[][] sum = new int[arr[0].length][arr.length];
        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i < arr.length; i++){
                sum[j][i] = arr[i][j];
            }
        } return sum;
    }
}
