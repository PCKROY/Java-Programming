package Polymorphism;

public class Circle extends Shapes{

    // This will run when obj. of Circle is created
    // Hence, it is overriding the parent method
    @Override   // this is called annotation
    void area(){
        System.out.println("Area is PI * r * r");
    }

     /* Can a static method be overridden ?
    => NO

       The static method in the parent class will always execute, regardless of whatever object calls it.
       Static methods can be passed down but not overridden.
       Because the parent class is not object-reliant.
       In other words, overriding is object-dependent,
       whereas static data is not. As a result, the static method cannot be overridden.

     */
}
