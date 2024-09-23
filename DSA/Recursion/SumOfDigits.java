package Recursion;

public class SumOfDigits {
    public static void main(String []args){
        int ans = sumOfDigits(515);
        System.out.println(ans);
    }
    static int sumOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
