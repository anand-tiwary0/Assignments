package recursionday0;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9, 2};
        System.out.println(issorted(arr));
    }

    public static boolean issorted(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr,index+1);
    }
}
