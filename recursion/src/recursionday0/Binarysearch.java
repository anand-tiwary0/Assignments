package recursionday0;

import java.util.Scanner;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {7,9,10,12,45,45,66,75,90,91,99,100};
        int target = 7;
        int start = 0;
        int end = arr.length;
        System.out.println(binarysearch(arr,target,start ,end));
    }

    static int binarysearch(int[] arr,int target,int start ,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            return binarysearch(arr,target,mid+1,end);
        }
        return binarysearch(arr,target,start,mid-1);
    }

}
