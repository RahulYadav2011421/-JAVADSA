package SortingAlgo;

import java.util.Arrays;

public class RecursiveSelection {
    public static void main(String args[]) {
        int[] arr = {4, 3, 2,-2,0,1};
        selection(arr, 0, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int arr[], int max, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[max]) {
                selection(arr, c, r, c + 1);
            } else {
                selection(arr, max, r, c + 1);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
        }
        selection(arr, 0, r - 1, 0);
    }
}
