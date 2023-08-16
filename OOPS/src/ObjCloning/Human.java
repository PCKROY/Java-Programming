package ObjCloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }


//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        // This is Shallow Copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        // This is Shallow Copy
        Human twin = (Human)super.clone();

        /* Shallow Copy: When we need to copy some entities from one object to another
            so that changes in one entity are reflected in the other entities as well,
            then we can perform a shallow copy. The default version of clone() method
            creates the shallow copy of an object. The shallow copy of an object will
            have exact copy of all the fields of original object. If original object
            has any references to other objects as fields, then only references of those
            objects are copied into clone object, copy of those objects are not created.
            That means any changes made to those objects through clone object will be
            reflected in original object as well.

            In shallow copy, new memory allocation never happens for the other entities,
            and the only reference is copied to the other entities.
           */

        // This is Deep Copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}       /* Deep Copy: When we need to copy some entities from one object to another
            so that changes in one entity are not reflected in the other entities,
            then we can perform a deep copy. The deep copy of an object will have exact
            copy of all the fields of original object just like shallow copy. But in addition,
            if original object has any references to other objects as fields, then copy of those
            objects are also created by calling clone() method on them. That means clone object and
            original object will be 100% disjoint. They will be 100% independent of each other.
            Any changes made to clone object will not be reflected in original object

            In deep copy, a new memory allocation happens for the other entities, and reference
            is not copied to the other entities. Each entity has its own independent reference.
         */

