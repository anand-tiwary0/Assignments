package recursionday0;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {34,43,21,1,5,7,12,5,122,5,11,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr){
        helper(arr,arr.length-1,0,0);
    }

    public static void helper(int[] arr,int row,int col, int maxindex){
        if(row==0){
            return;
        }
        if(row>col){
            if(arr[maxindex]<arr[col+1]){
                //this part givees max in the array
                maxindex = col+1;
                helper(arr,row,++col,maxindex);
            }
            else{
                helper(arr,row,++col,maxindex);
            }
        }
        else{
            //this part we are done with finding max now swap with the last element in unsorted part of array and then
            //prepare the environment for the next function call
            swap(arr,maxindex,row);
            row = row-1;
            col = 0;
            maxindex = 0;
            helper(arr,row,col,maxindex);
        }
    }

    public static void swap(int[] arr,int from, int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;

    }
}
