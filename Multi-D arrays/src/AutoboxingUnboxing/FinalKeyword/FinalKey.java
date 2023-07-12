package AutoboxingUnboxing.FinalKeyword;

public class FinalKey {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

//        final int bonus = 2 ;
//        bonus = 2;

        final A Bristy = new A("Bristy Dhar");
        Bristy.name = "other name";
        // when a non-primitive is final, you can not re-assign it
//        Bristy = new A("another name");

        A obj;
        for(int i = 0 ; i <1000000000 ; i++){
            obj = new A("random num");

//            obj.finalize();     // not possible because it is an exception
        }
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

    class A {
        final int num = 10;
         String name;

         A (String name){
             this.name = name;
         }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }

