

//Write a program to find the difference between the sum of all even elements
//        and the sum of all odd elements from the given array, A.



import java.util.Scanner;

public class EvenOddDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        int[] arr = new int[A];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int difference =even_odd(arr);
        System.out.println(difference);


    }

    public static int even_odd(int[] A) {
        int sum_even = 0;
        int sum_odd = 0;

        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0){
                sum_even = sum_even + A[i];
            } else {
                sum_odd = sum_odd + A[i];
            }
        }

        return (sum_even - sum_odd);
    }
}


