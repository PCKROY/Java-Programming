import java.util.Arrays;
public class RowColSum {
    public static int[] solve(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[] result = new int[row + col];

        // performing row sum :

        for(int i = 0; i < row; i++){
            int row_sum = 0;
            for(int j = 0; j < col; j++){
                row_sum += mat[i][j];
            } result[i] = row_sum;
        }
        // performing col_sum :

        for(int j = 0; j < col; j++){
            int col_sum = 0;
            for(int i = 0; i < row; i++){
                col_sum += mat[i][j];
            } result[row + j] = col_sum;

        }
        return result;

    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{2,4,6},{5,7,9}};
        int[] result = solve(mat);
        System.out.println(Arrays.toString(result));

    }

}
