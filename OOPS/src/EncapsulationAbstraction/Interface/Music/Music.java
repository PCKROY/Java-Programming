package EncapsulationAbstraction.Interface.Music;

public interface Music {
    public void MusicTune();
    public void TuneFork();
}
class Mymusic implements Music {

    @Override
    public void MusicTune() {
        System.out.println(" Tum zaha jaoge meh bhi tumhari piche piche jayungi ");
    }

    @Override
    public void TuneFork() {
        System.out.println(" la la la.....land ");
    }
}
