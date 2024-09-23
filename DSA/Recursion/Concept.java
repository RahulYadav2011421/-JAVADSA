package Recursion;

public class Concept{
    public static void main(String args[]){
        concept(5);
    }
    static void concept(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       // concept(n--);     -----it will give stack overflow b/c first its passing the value 5 all time
        concept(--n);
    }
}