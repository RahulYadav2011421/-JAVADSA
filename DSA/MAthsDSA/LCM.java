package MAthsDSA;

public class LCM {
    public static void main(String []args){
        System.out.println(lcm(7, 3));
    }
    static int lcm(int a,int b){
        return a*b/hcf(a,b);
    }
    static int hcf(int a,int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }
}
