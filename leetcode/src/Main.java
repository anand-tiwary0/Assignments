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


class Solution {
    public int missingNumber(int[] nums) {
        cyclicsort(nums);
        //now in cyclic sort every number should be at correct index i.e. i == a[i] as this array starts from 0
        for(int i=0,k=nums.length; i<k; i++){
            if(nums[i] != i){
                return i;
            }
        }

        //else the element that can't fit in the array i.e element = nums.length. return that
        return nums.length;
    }

//missing number cyclic sort
    static void cyclicsort(int[] arr){
        int i = 0;
        //here we have to ignore the element == nums.length as there is no room for it in the array

        while ( i< arr.length){
            if(arr[i]==arr.length){
                i++;
                continue;
            }
            int nowcorrectindex = arr[i];
            if(arr[nowcorrectindex] != arr[i]){
                swap(arr,i,nowcorrectindex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr,int from ,int to){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}


//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicsort(nums);
        ArrayList<Integer> missing = new ArrayList<>(2);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                missing.add(i+1);
            }
        }
        return missing;
    }

    static void cyclicsort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i]-1;
            if(nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}


//https://leetcode.com/problems/find-the-duplicate-number/submissions/

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                //case1 - the number is unique and missplaceced just swap
                int correctindex = nums[i]-1;
                if(nums[correctindex] != nums[i]){
                    swap(nums,i,correctindex);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}



//https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicsort(nums);
        ArrayList<Integer> obj = new ArrayList<>(1);
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=i+1){
                obj.add(nums[i]);
            }
        }
        return obj;
    }





    static void cyclicsort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i]-1;
            if(nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}


//https://leetcode.com/problems/set-mismatch/submissions/
class Solution {
    public int[] findErrorNums(int[] nums) {
        //same as repeating and missing
        cyclicsort(nums);
        int[] arr = new int[2];
        for(int i=0;i<nums.length; i++){
            if(nums[i]!=i+1){
                arr[0] = nums[i];
                arr[1] = i+1;
            }
        }
        return arr;
    }

    static void cyclicsort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctindex = nums[i]-1;
            if(nums[correctindex] != nums[i]){
                swap(nums,i,correctindex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] nums,int from, int to){
        int temp = nums[from];
        nums[from] = nums[to];
        nums[to] = temp;
    }
}

//https://leetcode.com/problems/max-consecutive-ones/submissions/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentcount = 0;
        int maxtillnow = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] == 1){
                currentcount++;
            }
            if (nums[i] == 0 || i == (nums.length - 1)){
                if(currentcount>maxtillnow){
                    maxtillnow = currentcount;
                }
                currentcount = 0;
            }
        }
        return maxtillnow;
    }
}
//https://leetcode.com/problems/single-number/submissions/

class Solution {
    public int singleNumber(int[] nums) {
        selectionsort(nums);
        int oddsum = 0;
        int totalsum = 0;
        for(int i =0;i<nums.length; i++){
            if(i%2 == 0){
                oddsum += 2 * nums[i];
            }
            totalsum += nums[i];
        }
        return oddsum - totalsum;
    }

    public static void selectionsort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int lastindexnow = arr.length - i -1;
            int maxindex = getmaxindex(arr,0,lastindexnow);
            swap(arr,maxindex,lastindexnow);
        }
    }
    public static void swap(int[] arr,int from,int to ){
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    public static int getmaxindex(int[] arr,int start, int last){
        int max = start;
        for(int i=start; i<=last; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}


//https://leetcode.com/problems/reverse-integer/submissions/


class Solution {
    public int reverse(int x) {
        int remember = 0;
        if(x<0){
            x = -1 * x;
            remember = 1;
        }
        int currentdigit = 0;
        double newnumber = 0;
        while(x>0){
            currentdigit = x%10;
            newnumber = 10*newnumber + currentdigit;
            x = x/10;
        }

        if(newnumber<Math.pow(2,31)-1){
            if(remember == 1 && -1*newnumber > -Math.pow(2,31)){
                return (int)(-1 * newnumber);
            }
            return (int)(newnumber);
        }
        return 0;
    }
}


//https://leetcode.com/problems/palindrome-number/submissions/


class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int currentdigit = 0;
        int newnumber = 0;
        int originalnumber = x;
        while(x>0){
            currentdigit = x%10;
            newnumber = newnumber*10 + currentdigit;
            x = x/10;
        }
        return newnumber==originalnumber;
    }
}

//https://leetcode.com/problems/binary-search/submissions/

class Solution {
    public int search(int[] nums, int target) {
       return  (binarysearch(nums,target,0,nums.length-1)); 
    }


    static int binarysearch(int[] nums,int target ,int start,int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;
        
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return binarysearch(nums,target,0,mid-1);
        }
        return binarysearch(nums,target,mid+1,end);
    }
}

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/submissions/

class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int lowesttillnow = arr[start];
        while(start<=end){
            int mid = start + (end - start)/2;
            //find if left array is sorted or not and store it's lowest value
            if(arr[mid]>=arr[start]){
                if(arr[start]<lowesttillnow){
                lowesttillnow = arr[start];
                }
                start = mid + 1;
            }

            //similarly for right half
            else if(arr[mid]<= arr[end]){
                if(arr[mid]<lowesttillnow){
                    lowesttillnow = arr[mid];
                }
                end = mid-1;
            }
        }
            return lowesttillnow;
    }
}


//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/


class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]== target){
                return mid;
            }

            //find in sorted part and eliminate it if not found
            //left
            if(nums[mid]>=nums[start])
            {
                if(target< nums[mid] && target >= nums[start]){
                    //remove other right part
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
            if(nums[mid]<=nums[end])
            {
                if(target > nums[mid] && target <= nums[end]){
                    //remove other right part
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}

//https://leetcode.com/problems/defanging-an-ip-address/submissions/

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder buffer = new StringBuilder(address.length()*2);
        for(int i=0, k = address.length(); i<k; i++){
            if(address.charAt(i)=='.'){
                buffer.append("[.]");
            }
            else{
                buffer.append(address.charAt(i));
            }
        }
        return buffer.toString();
    }
}


//https://leetcode.com/problems/shuffle-string/submissions/

class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder buffer = new StringBuilder(s);
        for(int i=0,k = indices.length; i<k; i++){
            buffer.setCharAt(indices[i],s.charAt(i));
        }
        return buffer.toString();
    }
}

//https://leetcode.com/problems/goal-parser-interpretation/submissions/

class Solution {
    public String interpret(String command) {
        StringBuilder arr = new StringBuilder();

        for(int i =0; i<command.length(); i++){
            char getchar = command.charAt(i);
            if(getchar == 'G'){
                arr.append("G");
            }
            else if(getchar == '('){
                if(command.charAt(i+1)==')'){
                    arr.append("o");
                    i = i+1;
                }
                else{
                    arr.append("al");
                    i = i+3;
                }
            }
        }
        return arr.toString();
    }
}


//https://leetcode.com/problems/fibonacci-number/submissions/

class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}


//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/


class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }

    private static int helper(int num ,int count){
        if(num == 0){
            return count;
        }
        count++;
        if(num%2 == 0){
            return helper(num/2,count);
        }
        return helper(num-1,count);
    }
}


//https://leetcode.com/problems/count-operations-to-obtain-zero/submissions/

class Solution {
    public int countOperations(int num1, int num2) {
        return helper(num1,num2,0);
    }

    public static int helper(int num1,int num2,int count){
        if(num1 == 0 || num2 == 0){
            return count;
        }

        count++;
        if(num1>=num2){
            num1 = num1 - num2;
            return helper(num1,num2,count);
        }
        num2 = num2 - num1;
        return helper(num1,num2,count);
    }
}

//https://leetcode.com/problems/power-of-two/submissions/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return ((n & (n-1)) == 0);
    }
}
