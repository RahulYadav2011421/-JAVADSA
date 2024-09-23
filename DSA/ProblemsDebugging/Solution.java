package ProblemsDebugging;

public class Solution {
    static int findFloor(long arr[], int n, long x)
    {
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low + (high - low)/2;
            if(x==arr[mid]){
                return mid;
            }
            if(x>arr[mid]){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return ans;
    }
    public static void main(String []args){
        long []arr={1,2,8,10,11,12,19};
        System.out.println(findFloor(arr,7,9));
    }
}

