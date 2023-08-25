import java.util.Arrays;
import java.util.Random;

public class Merge {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i =0 ; i<arr.length; i++){
            arr[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("after sorting");
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesort(int[] arr){
        helper(arr,0,arr.length-1);
    }

    public static void helper(int[] arr,int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            helper(arr, start, mid);
            helper(arr, mid+1,end);
            merge(arr, start, mid, end);
        }
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int start2 = mid+1;
        if(arr[mid]<=arr[start2]){
            return; //in this case the array is sorted by them self;
        }
        while(start<=mid && start2<=end){
            if(arr[start]<=arr[start2]){
                start++;
            }
            else{
                int value = arr[start2];
                int index = start2;
                //shift all the elements between first element and the second elemetn one unit by right
                while(index!=start){
                    arr[index] = arr[index-1];
                    index--;
               }
                arr[start] = value;

                //updating other vars
                start++;
                start2++;
                mid++;
            }
        }
    }
}
