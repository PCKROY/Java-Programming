package EncapsulationAbstraction.abstractDemo;

public abstract class Parent {

    int age;

    static void hello(){                 // static method can be used
        System.out.println(" hey ");
    }

    void normal(){          // A normal method can be used too. Can be override in subclasses
        System.out.println(" This is a normal method ");
    }

    public Parent(int age) {
        this.age = age;
    }

    abstract void career ();
    abstract void partner ();
}
