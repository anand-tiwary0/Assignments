package recursionday0;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {10,5,4,34,353};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        helper(arr,arr.length-1,0);
    }
    private static void helper(int[] arr,int row, int col){
        if(row == 0){
            return;
        }
        if(row>col){
            //check if next col element is larger or not if yes then swap else just increase col
            if(arr[col]>arr[col+1]) {
                swap(arr, col, col + 1);
            }
            helper(arr,row,++col);
        }
        else{
            row = row -1;
            col = 0;
            helper(arr,row,col);
        }
    }

    public static void swap(int[] arr,int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
