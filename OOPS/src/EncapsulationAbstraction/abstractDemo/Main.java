package EncapsulationAbstraction.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(26);
        son.career();
        son.partner();
        son.normal();

//        Daughter daughter = new Daughter(23);
//        daughter.career();

        Parent.hello();

//        Parent mom = new Parent(45);      // Can't create Object of the abstract class.
    }
}
