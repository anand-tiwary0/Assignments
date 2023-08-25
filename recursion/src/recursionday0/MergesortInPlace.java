package recursionday0;

import java.util.Arrays;
import java.util.Random;

public class MergesortInPlace {
    public static void main(String[] args) {
        int[] arr = new int[10];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = Random.nextInt(1000);
//        }
        int[] arr2 = {23,45,23,67,324,23,1,3,5,7,3,2};
        mergesortinplace(arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
    }


    public static void mergesortinplace(int[] arr ,int start ,int end){
        if(start>=end){
            return;
        }

        int mid = start + (end - start)/2;
        mergesortinplace(arr,start,mid);
        mergesortinplace(arr,mid+1,end);
        mergenowsorted(arr,start,mid,end);
    }

    private static void mergenowsorted(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = end;
        int k = 0;
        int[] mix = new int[(end - start)+1];
        while(i<mid && j<=end){
            if(arr[i]<=arr[j]){
                mix[k] = arr[i];
                k++; i++;
            }
            else{
                mix[k] = arr[j];
                j++; k++;
            }
        }

        //for remaining items in each sorted part of array
        while(i<mid){
            mix[k] = arr[i];
            i++; k++;
        }
        while(j<end){
            mix[k] = arr[j];
            j++; k++;
        }

        //copying sorted version in original array
        for(int l=0; l<mix.length; l++){
            arr[start+l] = mix[l];
        }
    }
}
