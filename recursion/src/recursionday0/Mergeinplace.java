package recursionday0;

import javax.print.attribute.standard.PrinterMakeAndModel;

import java.util.Random;

public class Mergeinplace {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0; i<arr.length; i++){
            arr[i] =
        }
        mergesort(arr,0,arr.length-1);
        System.out.println(arr);
    }

    public static void mergesort(int[] arr,int start,int end){
        if(start==end) return;
        int mid = start + (end - start)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid+1, end);
        //merge the sorted array
        merge(arr,start ,mid, end);
    }

    //now funtion to merge the sorted array for a paricular funtion call
    public static void merge(int[] arr, int low,int mid,int high){
        //a temp array to store the result
        int[] temp = new int[high-low + 1];
        int k = 0;
        while(low<=mid && mid+1 <= high){
            if(arr[low]<arr[])
        }

    }

}
