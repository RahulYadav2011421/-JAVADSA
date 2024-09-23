package OOPS.InterfaceExample;

public class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("start the electric engine");
    }
    @Override
    public void stop(){
        System.out.println("stop the electric engine");
    }
    @Override
    public void acc(){
        System.out.println("accelerate the electric engine");
    }
}
