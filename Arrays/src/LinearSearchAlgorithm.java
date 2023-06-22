import java.util.Scanner;
public class LinearSearchAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for ( int i = 0; i<n ; i++){            // input loop
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        int ans = -1;

        // Iterate over the array and update ans if the key is found

        for ( int i = 0 ; i<n ; i++){
            if ( arr[i] == key) {
                ans = i ;
                break ;
            }

        }

        // Iterates right to left and returns the last occurrence

        for ( int i = n-1 ; i>=0 ; i--){
            if ( arr[i] == key) {
                ans = i ;
                break ;
            }
        }






        System.out.println(ans);









    }
}



