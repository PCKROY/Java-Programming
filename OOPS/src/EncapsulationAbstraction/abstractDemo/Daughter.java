package EncapsulationAbstraction.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println(" I want to be a Doctor ." );
    }

    @Override
    void partner() {
        System.out.println(" I love SRK " );
    }
}
