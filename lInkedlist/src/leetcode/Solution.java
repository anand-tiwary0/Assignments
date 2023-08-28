package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(temp.val != temp.next.val){
                temp = temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
        return head;


    }
}



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1!=null && temp2 != null){
            if(temp1.val  <= temp2.val){
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp1.val);
                if(newnode == null){
                    newnode = tempnode;
                }
                else{
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp1 = temp1.next;
            }
            else{
                //this will run when item in 2nd node is larger
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp2.val);
                if(newnode == null){
                    newnode = tempnode;
                }
                else{
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp2 = temp2.next;
            }

            while(temp1 != null && temp1.next != null){
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp1.val);
                if(newnode == null){
                    newnode = tempnode;
                }
                else{
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp1 = temp1.next;
            }

            while(temp2 != null && temp2.next != null){
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp2.val);
                if(newnode == null){
                    newnode = tempnode;
                }
                else{
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while(temp.next != null){
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp2 = temp2.next;
            }

        }
        return newnode;
    }
}



//https://leetcode.com/problems/search-in-rotated-sorted-array/
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