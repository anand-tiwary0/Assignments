package recursionday0;

import java.util.ArrayList;

public class Findallarraymethod2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,4,5};
        int target = 4;
        System.out.println(findallindex(arr,target,0));
    }

    public static ArrayList<Integer> findallindex(int[] arr,int target, int index){
        ArrayList<Integer> obj = new ArrayList<Integer>(1);
        if(index == arr.length){
            return obj;
        }
        //this list will contain answer for this call only
        if(target == arr[index]){
            obj.add(index);
        }
        //answer from below calls
        ArrayList<Integer> answerbelow = findallindex(arr,target,index+1);
        obj.addAll(answerbelow);
        return obj;
    }
}
