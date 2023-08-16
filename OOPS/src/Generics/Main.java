package Generics;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Generics: Used to detect errors at Compile time rather than Runtime.
            Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force
            the java programmer to store a specific type of objects. */

        // Advantages of generics:
         /* 1) Type-safety: We can hold only a single type of objects in generics. It doesn't allow to store other
            objects. But without generics, we can store any type of objects. The "Object" is the superclass of all other
            classes, and Object reference can refer to any object. These features lack type safety which can be
            achieved via generics.
         */

        ArrayList list = new ArrayList(); // without using generics
        list.add(5);
        list.add("Hola");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(4);
        // list1.add("Wrong"); // shows error at compile time

        /* Type casting is not required: There is no need to typecast the object.
           But without using generics, we need to type cast. */

        ArrayList list2 = new ArrayList();
        list2.add("abcd");
        String s = (String) list2.get(0); // needs typecasting
        System.out.println(s);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("RISHI");
        String s1 = list3.get(0); // don't need typecasting as it is in generic
        System.out.println(s1);

        /* Compile-Time Checking: It is checked at Compile time.So, problem will not occur at Runtime.
           The good programming strategy says, "it is far better to handle the problem at Compile time rather
           than Runtime." */
        List<String> list4 = new ArrayList<>();
        list4.add("List");
        // list4.add(74); // will show error at compile time
    }
}