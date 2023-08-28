package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp1.val);
                if (newnode == null) {
                    newnode = tempnode;
                } else {
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp1 = temp1.next;
            } else {
                //this will run when item in 2nd node is larger
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp2.val);
                if (newnode == null) {
                    newnode = tempnode;
                } else {
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp2 = temp2.next;
            }

            while (temp1 != null && temp1.next != null) {
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp1.val);
                if (newnode == null) {
                    newnode = tempnode;
                } else {
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = tempnode;
                }
                temp1 = temp1.next;
            }

            while (temp2 != null && temp2.next != null) {
                //create node and add it to newnode
                ListNode tempnode = new ListNode(temp2.val);
                if (newnode == null) {
                    newnode = tempnode;
                } else {
                    //traverse till current null position then insert this node there
                    ListNode temp = newnode;
                    while (temp.next != null) {
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
