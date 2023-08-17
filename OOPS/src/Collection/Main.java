package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(34);
        list2.add(54);
        list2.add(21);
        list2.add(144);
        System.out.println(list2);


    }
}
                        /* collection framework: It is a framework that provides an architecture to store
                           and manipulate the group of objects. Java Collections can achieve all the
                           operations that you perform on a data such as searching, sorting, insertion,
                           manipulation, and deletion.
                           Java Collection means a single unit of objects. Java Collection framework provides
                           many interfaces (i.e. Set, List, Queue, Deque) and classes (i.e. ArrayList, Vector,
                           LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
                        */


 /* Vector class: A vector can be defined as a dynamic array that can grow
            or shrink on its own. For instance, vector will grow when more elements
            are added to it and will shrink when elements are removed from it.
            Similar to arrays, vector elements can be accessed using integer indices.

            It is similar to ArrayList, but with two differences −
            i) Vector is synchronized. Means all the methods in Vector are marked
              ‘synchronized’ and thus once a method invoke, the same method
              cannot be invoked unless the previous call has ended. In other words,
              only one thread can access it at a time unlike arraylist where multiple
              threads can access it.
            ii) The vector class has many methods that are not a part of the
                collections framework but its legacy methods.

            A Vector class is a part of the “java.util” package and implements
            List interface. A Vector is an array of objects or vector of objects.

            ArrayList is much faster than vector.
         */

//    List<Integer> vector = new Vector<>();
//        vector.add(18);
//                vector.add(30);
//                vector.add(10);
//                vector.add(74);
//
//                System.out.println(vector);
//                System.out.println(vector.size());