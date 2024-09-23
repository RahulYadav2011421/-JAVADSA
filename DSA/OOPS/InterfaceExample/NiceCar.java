package OOPS.InterfaceExample;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar(){
        engine=new PowerEngine();
        player=new CDPlayer();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startmusic(){
        player.start();
    }
    public void stopmusic(){
        player.stop();
    }
    public void upgradeEngine(){
        engine=new ElectricEngine();
    }
}
