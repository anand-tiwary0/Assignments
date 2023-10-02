package adityaverma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> Nsl = new ArrayList<>();
        ArrayList<Integer> Nsr = new ArrayList<>();
        //image pseudo element at end to be of 0 size
        int pseudoLeft = -1;
        int pseudoRight = arr.length;   //this indicates there is no element which is smaller then current on right side

        //let's find Nsl
        for(int i=0; i<arr.length; i++){
            if (stack.isEmpty()){
                Nsl.add(pseudoLeft);
            }

            //how can we access first element in the data structure of stack of stack as first element in internal stacks stores value and second one stores
            // the index of element
            else if(arr[stack.peek()] < arr[i]){
                Nsl.add(i);
            }
            else if(arr[stack.peek()] >= arr[i]){
                while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                    stack.pop(); //as these index are even greater the current elements so they can't be answers to other
                }
                if(stack.isEmpty()){
                    Nsl.add(-1);
                }
                else if(arr[stack.peek()]<= arr[i]){
                    Nsl.add(i);
                }
            }
            stack.push(i);  //add current element
        }
        stack.clear();
        // now calculate Nsr for each element
        for(int i=arr.length-1; i>=0 ; i--){
            if(stack.isEmpty()){
                Nsr.add(pseudoRight);
            }
            else if(arr[stack.peek()] < arr[i]){
                Nsr.add(i);
            }
            else if(arr[stack.peek()] >= arr[i]){
                while(stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    Nsr.add(pseudoRight);
                }
                else if(arr[stack.peek()] <= arr[i]){
                    Nsr.add(i);
                }
            }
            stack.push(i);
        }
        stack.clear();
        Collections.reverse(Nsr);


        // now we got nearest smallest element for left and right
        // so let's caculate the width of possible rectangles
//        ArrayList<Integer> width = new ArrayList<>(arr.length);
//        for(int i=0; i<arr.length; i++){
//            width.set(i, (int) (Nsl.get(i) - Nsr.get(i) - 1));
//        }
//
//        //let's find area for each possible solutions
//        ArrayList<Integer> area = new ArrayList<>(arr.length);
//        for(int i =0; i<arr.length; i++){
//            area.set(i,width.get(i) * arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Nsl.toString());
        System.out.println(Nsr.toString());

//        ArrayList<Integer> width = new ArrayList<>();
//        ArrayList<Integer> area = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            width.add(Nsl.get(i) - Nsr.get(i) - 1);
//            area.add(width.get(i) * arr[i]);
//        }

        //now find max area
//        int max = Collections.max(area);
//        System.out.println(max + " is the max possible area");
    }

}
