package Recursion;


public class HalfTrainglePattern {
    public static void main(String []args){
        traingle(5,0);
    }
    static void traingle(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("* ");
            traingle(r,c+1);
        }else {
            System.out.println();
            traingle(r - 1, 0);
        }
    }
}
