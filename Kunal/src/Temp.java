import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf(" Please input your Temp in C : ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
//        System.out.println(tempF);
        System.out.println(" Your desire Temp in F is : " + tempF);
    }
}
