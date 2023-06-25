import java.util.Scanner;
public class ReverseArr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[]temp = new int[num];
        int count = num;      // temp.length = num
        for( int i = 0; i < arr.length ; i++){
            temp[count - 1] = arr[i];
            count--;
        }
        for(int i : temp){
            System.out.print(i + " ");
        }

    }
}