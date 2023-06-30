public class MethodOverloading {    // in the same method add, we can save many datatype 
    static int add(int a , int b){
        System.out.println("Insert the first add ");
        return a + b;
    }
    static String add(String a , String b){
        System.out.println("Insert the second add ");
        return a + b;
    }
    static String add(int a , String b){
        System.out.println("insert the third add ");
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println();
        System.out.println(add("Apples", " Guava"));
        System.out.println();
        System.out.println(add(7 , " Pens"));

    }
}
