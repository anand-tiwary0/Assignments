import java.util.Arrays;
import java.util.Random;

public class Quicksort1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i =0; i<arr.length; i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("array before sort :: ");
        System.out.println(Arrays.toString(arr));
        quicksort(arr);
        System.out.println("array after sort :: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void quicksort(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        helper(arr,start,end);
    }

    private static void helper(int[] arr, int start, int end) {
        if(start>=end) return;

        int leftpointer = start;
        int rightpointer = end-1;
        //let's select pivot randomly as it gives best time complexity
//        int randindex = new Random().nextInt(end - start) + start;
        //now we take element at that index as pivot element
        int pivot = arr[end];
        //now swap it with last element
//        swap(arr,randindex,end);

        //now we will take all element which are less than pivot to lhs of pivot and greter element to the rhs of pivot
        while(leftpointer < rightpointer){
            while(arr[leftpointer] <= pivot && leftpointer < rightpointer) leftpointer++;
            while(arr[rightpointer] >= pivot && leftpointer < rightpointer) rightpointer--;
            swap(arr,leftpointer,rightpointer);
        }
        //now swap pivot with start index to keep it at it's desired position
        swap(arr,leftpointer,end);
        //recursive function call
        helper(arr,start,leftpointer-1);
        helper(arr,leftpointer+1,end);
    }
    public static void swap(int[] arr, int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}
