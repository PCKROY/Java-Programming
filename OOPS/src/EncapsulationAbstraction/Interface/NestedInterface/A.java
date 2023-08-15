package EncapsulationAbstraction.Interface.NestedInterface;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
        boolean isEven(int num);
    }
}
class B implements A.NestedInterface {
    // The nested interface can be declared as public, private or protected.
    // But the top level interface has to be declared as public or the default one.

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;               // Odd number is (num & 1) == 1 ;
    }

    @Override
    public boolean isEven(int num) {
        return (num & 1) == 0;             // Even number is (num & 1) == 0;
    }
}