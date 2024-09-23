package Recursion;

public class SkipApple {
    public static void main(String args[]){
        System.out.println(skipsApple("dffapplefdh"));
    }
    static String skipsApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipsApple(s.substring(5));
        }
        else{
            return s.charAt(0) + skipsApple(s.substring(1));
        }
    }
}
