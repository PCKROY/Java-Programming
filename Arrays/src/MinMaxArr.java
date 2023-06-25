import java.util.Scanner;
public class MinMaxArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int MinV = arr[0];
        for(int i = 0 ; i < arr.length ; i++){

            if(arr[i] < MinV){

                MinV = arr[i];
            }
        }
        int MaxV = arr[arr.length - 1];
        for(int i = arr.length - 1 ; i >= 0 ; i--){

            if(arr[i]>MaxV){

                MaxV = arr[i];

            }
        }
        System.out.println("The Min Value is = " + MinV );
        System.out.print("The Max Value is = " + MaxV );


    }
}