package adityaverma;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NGL {
    //given an array find an array dipicting nearest greatest element for a particular element if not found put -1
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,7,9};
        ArrayList<Integer> storesNgl = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        //start iterating from the first element
        for(int i=0; i<arr.length;i++){
            //case 1 when stack is empty that means there is no element to the left which is greater then current element
            if(stack.isEmpty()){
                storesNgl.add(-1);
            }
            else if(stack.peek()>arr[i]){
                storesNgl.add(stack.peek());
            }
            //other case is when top most stack element is not that greater then the current element
            else if(stack.peek() <= arr[i]){
                //pop till we reach to the the element which is greater then
                while(!stack.isEmpty() && stack.peek()<arr[i]){
                    stack.pop();
                }

                //now top will be pointing to the first element to the left which is greater then the given element
                if(stack.isEmpty()){
                    storesNgl.add(-1);
                }
                else if(stack.peek()>=arr[i]){
                    storesNgl.add(stack.peek());
                }
            }
            //after all checking has been done for the current element just add the current element to the stack
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(storesNgl.toString());
    }
}
