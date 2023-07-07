package BigIntegers;
import java.math.BigInteger;
public class factorials {
    public static void main(String[] args) {
         int a = 5;
        int ans = 1;
//        BigInteger ans = new BigInteger("1");

         for(int i = 1; i <= a; i++){
             ans = ans * i;
//             BigInteger temp = new BigInteger(i + "");
//             ans = ans.multiply(temp);

         }
        System.out.println(ans);
    }
}
