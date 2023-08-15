/*basic array questions*/

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/submissions/
class Solution {
    public boolean check(int[] nums) {
        int dropcount = 0;
        for(int i=0; i<nums.length; i++){
//here we are chekcing that drop has occured only once that is only once //place where larger in case of rotated array is greater than next one otherwise the previous element is always smaller then next one

            if(nums[i]>nums[(i+1) % nums.length]){
                dropcount++;
            }
        }
        return (dropcount<=1);
    }
}


//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
class Solution {
    public int removeDuplicates(int[] nums) {
        int currentunique = nums[0];
        int availablePosition = 0;
        nums.

        for(int i=1; i<nums.length; i++){
            if(nums[i] != currentunique){
                //set current unique to new element
                currentunique = nums[i];
                //increment positions
                availablePosition++;
                //now put that unique element there
                nums[availablePosition] = nums[i];
            }
            else if (nums[i]>= currentunique){
                continue;
            }
        }
        return (availablePosition+1);
    }
}


//https://leetcode.com/problems/rotate-array/submissions/
class Solution {
    public void rotate(int[] nums, int k) {
        //reverse till first part i.e form 0 to nums.lenght - k
        k = k%nums.length;
        reverse(nums,0 ,nums.length - 1 -k);
        reverse(nums,nums.length-k, nums.length-1);
        reverse(nums,0, nums.length-1);
    }

    static void reverse(int[] nums,int low ,int high){
        while(low<high){
            int temp = nums[high];
            nums[high] = nums[low];
            nums[low] = temp;
            low++;
            high--;
        }
    }
}


//https://leetcode.com/problems/move-zeroes/submissions/
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
            if(nums[i] == 0){
                continue;
            }
        }

        for(;j<nums.length; j++){
            nums[j] = 0;
        }
    }
}