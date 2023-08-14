package EncapsulationAbstraction.Interface.InterfaceProduct;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("The Electric Engine is stating");
    }

    @Override
    public void stop() {
        System.out.println("The Electric Engine is stopping");
    }

    @Override
    public void acc() {
        System.out.println("The Electric Engine is in a moderate accelerate");
    }
}
