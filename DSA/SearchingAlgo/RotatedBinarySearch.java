package SearchingAlgo;

public class RotatedBinarySearch {
    public static void main(String [] args){
        int []arr={5,6,7,8,9,1,2,3,4};
        System.out.println(rbs(arr,7,0,arr.length -1));
    }
    static int rbs(int []arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s + (e-s)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(target <= arr[mid] && target >= arr[s]) {
                return rbs(arr, target, s, mid - 1);
            }else{
                return rbs(arr,target,mid +1,e);
            }
        }
        if(target >= arr[mid] && target <= arr[e]){
            return rbs(arr,target,mid +1,e);
        }
        return rbs(arr,target,s,mid - 1);
    }
}
