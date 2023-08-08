package AccessControl;

public class subclass extends A {

    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(45, "Aryan");
        int n = obj.num;
    }

}

class subsubclass extends subclass{

    public subsubclass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        subclass obj = new subclass(45,"Aryan");
        int n = obj.num;
    }
}
 class subclass2 extends A {
    public subclass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subclass obj = new subclass(45,"Aryan");
        int n = obj.num;
    }

}
