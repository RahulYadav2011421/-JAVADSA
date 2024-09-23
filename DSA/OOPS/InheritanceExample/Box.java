package OOPS.InheritanceExample;

public class Box {
    double h;
    double l;
    double w;
    double weight;
    static void greeting(){
        System.out.println("im inside box");
    }

    Box(){
        this.h=1;
        this.l=1;
        this.w=1;
    }
    // cube
    Box(double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box(double h,double l,double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void inforamtion(){
        System.out.println("Box started : ");
    }
}
