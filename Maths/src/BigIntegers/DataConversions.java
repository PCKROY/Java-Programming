package BigIntegers;
import java.math.BigInteger;
public class DataConversions {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("10");
        BigInteger b = new BigInteger("10");

        BigInteger c = a.add(b);
        System.out.println(c);

        BigInteger d = a.pow(20);      // in terms of power, have to use int value
        System.out.println(d);

        BigInteger s = new BigInteger("12345678");
        BigInteger f = new BigInteger("8");
        BigInteger e = s.divide(f);
        System.out.println(e);

        BigInteger g = new BigInteger("1234");
        BigInteger h = new BigInteger("3");
        System.out.println(g.multiply(h));
        System.out.println(g.subtract(h));





    }
}
