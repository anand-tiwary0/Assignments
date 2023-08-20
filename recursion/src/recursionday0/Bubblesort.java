package recursionday0;

public class Bubblesort {
    public  static void bubblesort(int[] arr, int start,int end){
        //base condition
        if(start == end){
            return;
        }
        bubblesort(arr,start,end-1);
        
    }


    public static void main(String[] args) {
        int[] arr = {7,6,3,5,2};
        bubblesort(arr,0,arr.length - 1);
    }
}
