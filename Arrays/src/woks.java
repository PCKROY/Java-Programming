import java.util.Scanner;

public class woks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();

        int[]arr1 = {25,50,75,100,125,150,200,250,300,400,500};
        for ( int i = 0 ; i< arr1.length;i++){
            float percentage = num * (arr1[i] / 100f);
            System.out.println(percentage);
        }
















        }

    }
