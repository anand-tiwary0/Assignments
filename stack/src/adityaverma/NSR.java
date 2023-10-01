package adityaverma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class NSR {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,7,9};
        ArrayList<Integer> storesNsr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        //as we have to find right smallest we will iterate from right
        for(int i = arr.length-1; i>=0; i--)
        {
            if(stack.isEmpty()){
                storesNsr.add(-1);
            }
            else if(stack.peek() < arr[i]){
                storesNsr.add(stack.peek());
            }
            else if(stack.peek()>= arr[i]){
                //pop till we find first smallest as no one of these will be answer of other as current element will be
                //nearer to them but it is still smaller then these so current or only smaller then this will be answers
                while(!stack.isEmpty() && stack.peek()>= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    storesNsr.add(-1);
                }
                else if(stack.peek() <= arr[i]) {
                    storesNsr.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        Collections.reverse(storesNsr);
        System.out.println(Arrays.toString(arr));
        System.out.println(storesNsr.toString());
    }

}
