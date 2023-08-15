package EncapsulationAbstraction.Interface.NestedInterface;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(7));

        B obj1 = new B();
        System.out.println(obj1.isEven(8));
    }
}
