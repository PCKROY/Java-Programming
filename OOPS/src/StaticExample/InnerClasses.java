package StaticExample;

// Outside classes cannot be static since it is not dependent on any other class. Only inner classes can be static.

public class InnerClasses {

    // When a class is declared as static, then it will not be dependent on the objects of its upper-class

    static class test {
        String name;


        public test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        test obj = new test("Kunal");
        test obj1 = new test("Rahul");
        test obj2 = new test("Himadri");

        System.out.println(obj.name);
        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }


}
