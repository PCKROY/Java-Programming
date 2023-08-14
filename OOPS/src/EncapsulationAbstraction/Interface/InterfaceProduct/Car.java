package EncapsulationAbstraction.Interface.InterfaceProduct;

public class Car implements Engine , Brake , Media{
    @Override
    public void Brake() {
        System.out.println("Audi has a good braking system");
    }

    @Override
    public void start() {
        System.out.println("Audi has a very good starting sound");
    }

    @Override
    public void stop() {
        System.out.println("Audi will stop");
    }

    @Override
    public void acc() {
        System.out.println("Audi has a very good accelerate power");

    }
}
