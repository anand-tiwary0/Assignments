package adityaverma;

import java.util.*;

public class NGR{
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,7,9};
        ArrayList<Integer> storesNgr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        //we will start iteration from left hand side and for the last element we will by default put -1
        for(int i = arr.length-1; i>=0; i--){
            if(stack.isEmpty()){
                storesNgr.add(-1);
            }
            else if(stack.peek()>arr[i]){
                storesNgr.add(stack.peek());
            }
            //in case the top of the stack is smaller pop till we reach the larger element and fact is that whatever smaller
            // then current element in the stack will never be the answer for the earlier elements
            else if(stack.peek()<=arr[i]){
                //pop till we have greater element
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
                //now either top of stack will be desired answer or the
                if(stack.isEmpty()){
                    storesNgr.add(-1);
                }
                else if(stack.peek()>=arr[i]){
                    storesNgr.add(stack.peek());
                }
            }


            //now after doing all such operations just add the current element to stack for further calculations
            stack.push(arr[i]);
        }
        //here the real ngr for each elements will be in reverse order for each element so reverse the arraylist
        Collections.reverse(storesNgr);
        System.out.println(Arrays.toString(arr));
        System.out.println(storesNgr.toString());

    }

}
