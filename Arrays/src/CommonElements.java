import java.util.Scanner;
public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] N1 = new int[num];

        for(int i = 0; i<num ; i++ ){
            N1[i] = sc.nextInt();
        }
        int num1 = sc.nextInt();
        int[] N2 = new int[num1];

        for( int i = 0; i<num1 ; i++){
            N2[i] = sc.nextInt();
        }

        int sm = 0;
        if( num < num1){
            sm = num1 ;
        }else {
            sm = num ;
        }
        int[] N3 = new int[sm];
        int count = 0;
        for( int i = 0 ; i < N1.length ; i++){
            for ( int j = 0; j< N2.length ; j++){
                if(N1[i] == N2[j]){
                    N3[count] = N1[i];
                    count++ ;
                    break;

                }
            }
        }
        int[] output = new int[count];
        for( int i = 0 ; i < count ; i++){
            output[i] = N3[i];
        }
        for( int i : output){
            System.out.print(i + " ");
        }
    }
}


