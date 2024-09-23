package Recursion;

public class SkipAppNotApple {
    public static void main(String args[]){
        System.out.println(skipappnotapple("dfappjskljappldg"));
    }
    static String skipappnotapple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return skipappnotapple(s.substring(3));
        }
        else{
            return s.charAt(0) + skipappnotapple(s.substring(1));
        }
    }
}
