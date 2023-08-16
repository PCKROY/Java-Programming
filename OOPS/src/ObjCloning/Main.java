package ObjCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Aryan = new Human(26,"Aryan");
//        Human twin = new Human(Aryan);
        Human twin = (Human) Aryan.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 50;
        System.out.println(Arrays.toString(twin.arr));       // It will change the 0 th index to 50 as twin.arr[0] is changed to 50 from 3.
        System.out.println(Arrays.toString(Aryan.arr));     // I changed the twin variables... but it changed the Aryan one.
                                                           // This is shallow copy. But when I did deep copy,
                                                          //The value will not change.
    }
}

