import java.util.Scanner;
public class palanidrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // To generate the reverse of str

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();

        if(str.equals(rev)){
            System.out.println("yes");  // tenet ulta likhleo tenet ashe. tai yes output ashbe.
        }else{
            System.out.println("no");
        }



    }
}
