import static java.lang.Math.PI;

public class Maths {
    public static void main(String[] args) {

        int maxV =Math.max(10,8);
        int minV =Math.min(8,2);

        System.out.println(maxV);
        System.out.println(minV);

        /// Roundup method :

        double x = Math.floor(3.4);
        double y = Math.ceil(3.7);
        double z = Math.round(3.4);
        double a = Math.round(3.7);
        double d = Math.round(3.5);

        System.out.println(x);  // 3.0
        System.out.println(y);  // 4.0
        System.out.println(z);  // 3.0
        System.out.println(a);  // 4.0
        System.out.println(d);  // 4.0

        /// Log maths :

        double E = Math.E;
        System.out.println(E);
        double g = Math.log(E);
        double h = Math.log10(100);
        System.out.println(g);
        System.out.println(h);

        /// power and sqrt method :

        double f = Math.pow(5,5);
        System.out.println(f);

        double r = Math.sqrt(3125);
        System.out.println(r);

        /// Trigonometry func. :

        double pi = PI;
        System.out.println(pi);

        System.out.println(Math.sin(PI / 6));   // 1/2 = sin 30
        System.out.println(Math.cos(PI / 3));   // 1/2 = cos 60
        System.out.println(Math.tan(PI / 4));   // 1   = tan 45

      }
    }
