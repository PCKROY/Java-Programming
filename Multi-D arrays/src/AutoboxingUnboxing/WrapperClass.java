package AutoboxingUnboxing;
import java.util.ArrayList;
public class WrapperClass {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        int a = 10;
        float f = 3.25F;
        long l = 6000;

        // Autoboxing :

        Integer intobj = a;
        Float floatobj = f;
        Long longobj = l;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.sum(10,18));

    }
}
