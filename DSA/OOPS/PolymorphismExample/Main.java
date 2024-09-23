package OOPS.PolymorphismExample;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Traingle t= new Traingle();
        Circle c= new Circle();
        Shapes circle=new Circle();
        shape.area();
        circle.area();
    }
}
