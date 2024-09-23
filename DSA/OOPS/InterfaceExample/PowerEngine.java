package OOPS.InterfaceExample;

public class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("start the power engine");
    }
    @Override
    public void stop(){
        System.out.println("stop the power engine");
    }
    @Override
    public void acc(){
        System.out.println("accelerate the power engine");
    }
}
