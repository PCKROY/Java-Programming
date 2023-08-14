package EncapsulationAbstraction.Interface.InterfaceProduct;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("MusicPlayer Starts");
    }

    @Override
    public void stop() {
        System.out.println("MusicPlayer Stops");
    }
}
