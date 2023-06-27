

//  Given an array A, check if it is sorted in ascending order or not.



import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] arr = new int[A];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean ascending = true;

        for(int i = 1 ; i < arr.length ; i++){
            if (arr[i] > arr[i-1]){
                ascending = true;
                continue;
            } else {
                ascending = false;
                break;
            }
        }
        if(ascending){
            System.out.println("True");
        } else{
            System.out.println("False");
        }


    }


}

