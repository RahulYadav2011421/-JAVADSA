package Recursion;

public class ProductOfDigit{
    public static void main(String args[]){
        System.out.println(printProduct(305));
    }
    static int printProduct(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)  * printProduct(n/10);
    }
}