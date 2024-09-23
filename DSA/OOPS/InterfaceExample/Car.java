package OOPS.InterfaceExample;

public class Car implements Engine,Brake,Media {
    @Override
    public void brake(){
        System.out.println("normal brake");
    }
    @Override
    public void start(){
        System.out.println("petrol start");
    }
    @Override
    public void stop() {
        System.out.println("petrol stop");
    }
    @Override
    public void acc() {
        System.out.println("petrol accelerate");
    }
}
