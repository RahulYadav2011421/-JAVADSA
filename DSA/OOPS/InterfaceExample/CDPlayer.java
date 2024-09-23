package OOPS.InterfaceExample;

public class CDPlayer implements Media{
    @Override
    public void start(){
        System.out.println("start the music");
    }
    @Override
    public void stop(){
        System.out.println("stop the music");
    }
}
