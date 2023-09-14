package substrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Substring {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {1,2,2,3};
        System.out.println("let's find the permutations of all elements where elements repeat ::");
        List<List<Integer>> list2 = duplicatesub(arr2);
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println("let's find the all permutations :: ");
        List<List<Integer>> list = subsets(arr);
        System.out.println(Arrays.toString(list.toArray()));
    }

    //basic form of permutation [[],["a"],["b"],["c"],["ab"],["bc"],["ac"],["abc"]] substring
    public static List<List<Integer>> subsets(int[] arr){
        //solve it through iterative method
        //let us take a outer list of to store all possible permutations
        List<List<Integer>> outer = new ArrayList<>();
        //first of all just insert a empty list in it as any arr will have emepty list as subset
        outer.add(new ArrayList<>());
        //for now let's assume that there is no duplicate element
        for(int i =0; i<arr.length; i++){
            //now for each number in array make a copy of existing array and then append the number to all copy
            int length = outer.size();
            for(int j =0; j<length; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                //now append this list to outer list
                outer.add(inner);
            }
        }
        return outer;
    }

    public static List<List<Integer>> duplicatesub(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i =0 ;i <arr.length; i++){
            int start = 0;
            int end = outer.size();
            if(i>0 && arr[i]==arr[i-1]){
                start = (outer.size()/2);
            }
            for(int j = start; j<end; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
