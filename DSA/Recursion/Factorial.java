package Recursion;

public class Factorial {
    public static void main(String []args){
        int ans=printFactorial(5);
        System.out.println(ans);
    }
    static int printFactorial(int n){
        if(n<=1){
            return 1;
        }
        return n * printFactorial(n-1);
    }
}
