package OOPS.InterfaceExample;

public class Main {
    public static void main(String []args){
//        Car car=new Car();
//        car.start();
//        car.brake();
//        car.acc();
//        car.stop();
        Media car1=new Car();
        car1.start();
        car1.stop();
        NiceCar car=new NiceCar();
        car.start();
        car.startmusic();
        car.upgradeEngine();
        car.start();
    }
}
