package leetcode;

public class Mergesort {
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
        public ListNode sortList(ListNode head) {
            //first find mid element
            if(head == null || head.next == null){
                return head;
            }
            ListNode mid = findmid(head);
            ListNode leftsorted = sortList(head);
            ListNode rightsorted = sortList(mid);

            return merge(leftsorted,rightsorted);

        }
        public static ListNode findmid(ListNode head){
            ListNode fast = head;
            ListNode midprev = null;
            while(fast != null && fast.next != null){
                midprev = (midprev==null)?head:midprev.next;
                fast = fast.next.next;
            }
            //now we have found midprev now we will break this link here
            ListNode mid = midprev.next;
            midprev.next = null; //now list is broken
            return mid;
        }

        public static ListNode merge(ListNode list1, ListNode list2){
            ListNode dummyhead = new ListNode();
            ListNode tail = dummyhead;
            while(list1 != null && list2 != null){
                if(list1.val <= list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                }
                else{
                    tail.next = list2;
                    list2 = list2.next;
                }
                tail = tail.next;
            }

            tail.next = (list1!= null) ?list1:list2;
            return dummyhead.next;
        }
    }
}
