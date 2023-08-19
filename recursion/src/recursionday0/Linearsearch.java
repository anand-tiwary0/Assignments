package recursionday0;

public class Linearsearch {

    public static int availableat(int[] arr, int target, int index){
        if(index >= arr.length){
            return -1;
        }

        return arr[index] == target ? index : availableat(arr,target,index+1);
    }


    public static void main(String[] args) {
        int[] arr = {3,2,1,18,9};
        int target = 99;
        System.out.println(availableat(arr,target,0));
    }
}
