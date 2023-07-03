import java.util.Scanner;
public class Iterating2Darrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr1 = new int[rows][cols];

        // Input of 2-D array :

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        // Output of 2-D array :

        for(int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                System.out.print(arr1[i][j] + " ");


            }
            System.out.println();
        }
        System.out.println();



        int[][] arr = {
                {2,4,6,8,0},
                {1,3,5,7,9},
                {1,2,3,4,5}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");


            }  System.out.println();

        }




            }

        }


