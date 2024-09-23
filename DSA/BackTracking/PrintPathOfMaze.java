package BackTracking;

import java.util.ArrayList;

public class PrintPathOfMaze {
    public static void main(String args[]) {
        path("", 3, 3);
        System.out.println(pathReturn("",3,3));
        System.out.println(pathReturnDiagonal("",3,3));
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    static ArrayList<String> pathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (r > 1) {
            ans.addAll(pathReturn(p + 'D', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathReturn(p + 'R', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> pathReturnDiagonal(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if (r > 1 && c>1) {
            ans.addAll(pathReturnDiagonal(p + 'D', r - 1, c-1));
        }
        if (r > 1) {
            ans.addAll(pathReturnDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            ans.addAll(pathReturnDiagonal(p + 'H', r, c - 1));
        }
        return ans;
    }
}
