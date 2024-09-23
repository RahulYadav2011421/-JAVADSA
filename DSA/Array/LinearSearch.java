package Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 56,2, 4, 4, 64,2, 74, 4,2};
        System.out.println(findIndex(arr, 74, 0));
        //System.out.println(findAllIndex(arr, 4, 0, new ArrayList<>()));
        ArrayList<Integer> ans= findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
        System.out.println(findAllIndex1(arr,2,0));
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        return arr[index] == target ? index : findIndex(arr, target, index + 1);
    }

    //    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int []arr,int target,int index){
//        if(index ==  arr.length){
//            return;
//        }
//        if(arr[index] == target){
//            list.add(index);
//        }
//        findAllIndex(arr,target,index + 1);
//    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
            return findAllIndex(arr, target, index + 1, list);
    }

    static ArrayList<Integer> findAllIndex1(int arr[],int target,int index){
        ArrayList<Integer> list= new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex1(arr,target,index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
