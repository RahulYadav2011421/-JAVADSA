package OOPS.InheritanceExample;

public class BoxWeight extends Box{
    double weight;
    //@Override
    static void greeting(){
        System.out.println("im inside boxwieght");
    }
    BoxWeight(){
        this.weight=23;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight=other.weight;
    }
    BoxWeight(double h,double l,double w,double weight){
        super(h,l,w);
        System.out.println(super.weight);
        this.weight=weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
