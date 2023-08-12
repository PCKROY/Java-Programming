package EncapsulationAbstraction.Interface.ExtendDemo;

public interface A {
    // Static interface methods should always have a body
    // Call it via interface name

    static void greeting(){
        System.out.println(" Hey, I am in static method ");
    }

    default void fun(){
        System.out.println(" Hey, I am in A ");
    }
}
