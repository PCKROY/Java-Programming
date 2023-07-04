import java.util.Scanner;
public class SumMat {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];


//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                a[i][j] = sc.nextInt();
//            }                                     // For loop method 
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                b[i][j] = sc.nextInt();
//            }
//        }

        matrixRead(a);
        matrixRead(b);

        int[][] c = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];

            }

        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();

        }
    }

    static void matrixRead(int[][] mat) {
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }



            }





