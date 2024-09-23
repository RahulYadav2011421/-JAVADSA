package OOPS.InheritanceExample;

public class Main {
    public static void main(String args[]){
        Box box1=new Box();
        System.out.println(box1.h+ " " +box1.l+ " " + box1.w);
        BoxWeight box2=new BoxWeight();
        //BoxWeight box3=new BoxWeight(2,4,1,45);
        System.out.println(box2.h + " " + box2.weight);


        BoxPrice box4=new BoxPrice(3,5,4555);
        System.out.println(box4);
        BoxWeight boj=new BoxWeight();
        Box.greeting();
    }
}
