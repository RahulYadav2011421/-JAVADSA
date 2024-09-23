package Recursion;

public class Subseque1 {
    public static void main(String args[]){
        subseque("","abc");
    }
    static void subseque(String process,String unprocess){
        if(unprocess.isEmpty()){
            System.out.println(process);
            return;
        }
        char ch = unprocess.charAt(0);
        subseque(process + ch ,unprocess.substring(1));
        subseque(process,unprocess.substring(1));
    }
}
