package SortingAlgo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String []args){
        int []arr={5,4,3,2,1,7,8,6,0,-9};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int []arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i -1;
            int maxIndex = findMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    static int findMaxIndex(int []arr,int start,int end){
        int max= start;
        for(int i=start; i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int [] arr,int first,int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
