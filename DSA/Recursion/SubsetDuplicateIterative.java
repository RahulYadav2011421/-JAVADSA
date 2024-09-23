package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicateIterative {
    public static void main(String args[]){
        int arr[]={2,1,2};
        List<List<Integer>> ans=subset(arr);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int last=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]== arr[i-1]){
                start=last + 1;
            }
            last=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
