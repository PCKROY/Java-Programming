package EncapsulationAbstraction.Interface.ExtendDemo;

public class Main implements A,B{

    @Override
    public void greet() {           // Access modifier must be the same as it is in interface class,
                                   // like public in B class, so have to use public modifier here also.
    }


    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
