package EncapsulationAbstraction.Interface.InterfaceProduct;

public class OilEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("The engine is in a good accelerate ");
    }
}
