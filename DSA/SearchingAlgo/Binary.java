package SearchingAlgo;

public class Binary {
    public static void main(String args[]){
        int arr[]= {2,4,5,6,7,8};
        System.out.println(binarySearch(arr,-2,0,arr.length-1));
    }
    static int binarySearch(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target > arr[mid]){
            return binarySearch(arr,target,mid + 1,end);
        }
        else{
            return binarySearch(arr,target,start,mid - 1);
        }
    }
}
