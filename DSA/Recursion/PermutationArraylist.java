package Recursion;
import java.util.ArrayList;
public class PermutationArraylist {
    public static void main(String args[]) {
        System.out.println(permutation("", "abc"));
        System.out.println(permutationcount("","abdc"));
    }

    static ArrayList<String> permutation(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutation(first + ch + second, up.substring(1)));
        }
        return ans;
    }

    static int permutationcount(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + (permutationcount(first + ch + second, up.substring(1)));
        }
        return count;
    }
}
