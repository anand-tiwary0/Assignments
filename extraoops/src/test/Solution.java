package test;

class Solution {
    public static int findPeakElement(int[] nums) {
        if(nums.length == 1 || nums[0]>nums[1]) return 0;
        int len = nums.length -1 ;
        if(nums[len]>nums[len-1]) return len;
        int start = 1;
        int end = len-1;
        while(start>=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
}