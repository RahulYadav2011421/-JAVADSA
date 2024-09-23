package BitWise;

public class FindUnique {
    public static void main(String args[]){
        int []num={3,4,6,3,2,4,5,6,2};
        System.out.println(ans(num));
    }
    static int ans(int []arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
