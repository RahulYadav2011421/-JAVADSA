package Recursion;

public class SkipElements1 {
    public static void main(String args[]){
        skip("","avadka");
    }
    static void skip(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        if(ch=='a'){
            skip(process,unprocess.substring(1));
        }
        else{
            skip(process+ch,unprocess.substring(1));
        }
    }
}
