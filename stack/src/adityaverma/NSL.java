package adityaverma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,7,9};
        ArrayList<Integer> storesNsl = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                storesNsl.add(-1);
            }
            else if(stack.peek() < arr[i]){
                storesNsl.add(stack.peek());
            }
            else if(stack.peek()>=arr[i]){
                while(!stack.isEmpty() && stack.peek()>=arr[i]){
                    stack.pop();
                }
                //now either top will be smallest or stack will be empty
                if(stack.isEmpty()){
                    storesNsl.add(-1);
                }
                else if(stack.peek()<= arr[i]){
                    storesNsl.add(stack.peek());
                }
            }

            //now store current element in the stack for further analysis
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(storesNsl.toString());
    }
}
