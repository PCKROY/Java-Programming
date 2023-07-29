public class ComplexNumberTest {

        public float real;
        public float imaginary;

        ComplexNumberTest(float real , float imaginary){       // constructor method
            this.real = real;
            this.imaginary = imaginary;
        }
        ComplexNumberTest add(ComplexNumberTest x){
            float add_real = this.real + x.real;
            float add_imaginary = imaginary + x.imaginary;
            ComplexNumberTest result = new ComplexNumberTest(add_real,add_imaginary);
            return result;
        }
        ComplexNumberTest subtract(ComplexNumberTest x){
            float sub_real = this.real - x.real;
            float sub_imaginary = imaginary - x.imaginary;
            ComplexNumberTest result1 = new ComplexNumberTest(sub_real,sub_imaginary);
            return result1;
        }
        ComplexNumberTest multiply(ComplexNumberTest x){
        float mul_real = (this.real * x.real) - (this.imaginary * x. imaginary);
        float mul_imaginary = (this.real * x.imaginary) + (this.imaginary * x.real);
        ComplexNumberTest result2 = new ComplexNumberTest(mul_real,mul_imaginary);
        return result2;
    }
        ComplexNumberTest divide(ComplexNumberTest x){
//        float conjugate =
        float div_real = (this.real * x.real + this.imaginary * x.imaginary)/(x.real * x.real + x.imaginary * x.imaginary);
        float div_imaginary = (this.imaginary * x.real - this.real * x.imaginary)/(x.real * x.real + x.imaginary * x.imaginary);
        ComplexNumberTest result3 = new ComplexNumberTest(div_real,div_imaginary);
        return result3;
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    public static class test1 {



        public static void main(String[] args) {
            ComplexNumberTest a = new ComplexNumberTest(10f, 5f);
            ComplexNumberTest b = new ComplexNumberTest(2f, 3f);

            ComplexNumberTest c1 = a.add(b);
            System.out.println(c1);


            ComplexNumberTest c2 = a.subtract(b);
            System.out.println(c2);

            ComplexNumberTest c3 = a.multiply(b);
            System.out.println(c3);


            ComplexNumberTest c4 = a.divide(b);
            System.out.println(c4);


        }
    }
}

