
public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {0,1,2,3},
                {1,3,5,7,9},
                {2,4,6,8,0},
                {1,2,3,4,5,6,7,8,9,0},
        };

        System.out.println(arr[2][3]);
        System.out.println(arr[3][7]);
        System.out.println(arr[1][3]);
        System.out.println(arr[0][0]);




    // Creating 2-D arrays matrices
        int rows = 3;
        int cols = 4;
        int[][] a = new int[rows][cols];

        a[2][2] = 20;
        System.out.println(a[2][2]);
        System.out.println(a[1][2]); // created 3*4 matrices... where every value is not defined is zero.


    }
}