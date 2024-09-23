package Recursion;

public class PrintHello {
    public static void main(String args[]){
        message();
    }
    static void message(){
        System.out.println("Hell");
        message1();
    }
    static void message1(){
        System.out.println("Hell");
        message2();
    }
    static void message2(){
        System.out.println("Hell");
        message3();
    }
    static void message3(){
        System.out.println("Hell");
        message4();
    }
    static void message4(){
        System.out.println("Hell");
    }
}
