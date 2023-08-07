package AccessControl;

public class main {
    public static void main(String[] args) {
        A obj = new A(10,"Prokash");


        // Need to do a few things
        // 1. Access the data members.
        // 2. Modify the data members.

//        obj.num         // can't get num in this way as num is in private .

        obj.getNum();
//        obj.setNum();
        int n = obj.num;


    }
}

 /* Access modifiers: In java, access modifiers specifies the accessibility or scope of a field, method,
            constructor, or class. There are four types of Java access modifiers:

            => Private: The access level of a private modifier is only within the class. It cannot be accessed from
                        outside the class.
            => Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
                       outside the class, within the package as well as outside the package.
            => Protected: The access level of a protected modifier is within the same package and outside the package
                          via child class. If you do not make the child class, it cannot be accessed from outside
                          the package.
            => Default: The access level of a default modifier is only within the package. It cannot be accessed from
                        outside the package. If you do not specify any access level, it will be considered as default.
         */