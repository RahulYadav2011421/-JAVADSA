package Recursion;
import java.util.ArrayList;
public class Subseque2 {
    public static void main(String args[]){
        System.out.println(subseq("","abc"));
    }
    static ArrayList<String> subseq(String process,String unprocess){
        if(unprocess.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(process);
            return list;
        }
        char ch = unprocess.charAt(0);
        ArrayList<String> first= subseq(process + ch,unprocess.substring(1));
        ArrayList<String> second=subseq(process,unprocess.substring(1));
        first.addAll(second);
        return first;
    }
}
