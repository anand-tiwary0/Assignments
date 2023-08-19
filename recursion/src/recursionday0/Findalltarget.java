package recursionday0;

import java.util.ArrayList;

public class Findalltarget {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int target = 4;
        System.out.println(find(arr,target,arr.length-1).toString());
    }

    public static ArrayList<Integer> find(int[] arr,int target, int index){
        ArrayList<Integer> targetindex = new ArrayList<>(1);
        return helper(arr,target,index,targetindex);
    }

    private static ArrayList<Integer> helper(int[] arr,int target,int index ,ArrayList<Integer> targetindex){
        if(index == -1){
            return targetindex;
        }
        if(target == arr[index]){
            targetindex.add(index);
        }
        return helper(arr,target,index-1,targetindex);
    }

}
