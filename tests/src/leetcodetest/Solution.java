package leetcodetest;

import java.util.Arrays;

class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        arr[0] = start; arr[1] = end;
        return arr;
    }

    private static int search(int[] nums,int target, boolean which){
        int start = 0;
        int end = nums.length - 1;
        int ansindex = -1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                ansindex = mid;
                //and then look for other possible answers
                if(which == true) end = mid -1; //when we are looking for start index
                else start = mid + 1; //we are now looking for end index;
            }
            else if(nums[mid]>target) end = mid -1;
            else start = mid + 1;
        }

        return ansindex;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,2,5,5,5,5,6,7,8,9};
//        searchRange(arr,2);
        System.out.println(Arrays.toString(searchRange(arr,2)));
    }
}