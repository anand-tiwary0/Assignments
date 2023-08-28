package leetcode;

//https://leetcode.com/problems/search-in-rotated-sorted-array/
class Solution44 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            //find in sorted part and eliminate it if not found
            //left
            if (nums[mid] >= nums[start]) {
                if (target < nums[mid] && target >= nums[start]) {
                    //remove other right part
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (nums[mid] <= nums[end]) {
                if (target > nums[mid] && target <= nums[end]) {
                    //remove other right part
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
