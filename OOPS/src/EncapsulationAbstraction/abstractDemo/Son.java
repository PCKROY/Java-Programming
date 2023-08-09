package EncapsulationAbstraction.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        System.out.println(" Every fooking thing is not normal any more .");

    }

    @Override
    void career() {
        System.out.println(" I want to be a Software Engineer ." );
    }

    @Override
    void partner() {
        System.out.println(" I love Himadri. She is 23 . "  );
    }
}
