import java.util.Arrays;
import java.util.Random;

public class Quicksortkunal {
    public static void main(String[] args) {
        Random rand =new Random();
        int[] arr = new int[10];
        for(int i =0 ;i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Array before sort :: ");
        System.out.println(Arrays.toString(arr));
        quick(arr);
        System.out.println("array after sort :: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quick(int[] arr){
        helper(arr,0,arr.length-1);
    }

    public static void helper(int[] arr,int low,int high){
        if(low>=high){
            return;
        }

        int mid = low + (high-low)/2;
        int pivot = arr[mid];
        int fp = low;
        int lp = high;
        while(fp<=lp){
            while(arr[fp]<pivot) fp++;
            while(arr[lp]>pivot) lp--;
            if(fp<=lp){
                swap(arr,fp,lp);
                fp++;
                lp--;
            }
        }
        helper(arr,low,lp);
        helper(arr,fp,high);
    }

    public static void swap(int[] arr,int from , int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
