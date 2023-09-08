package leetcode;

  //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public static void insertfirst(int val){
          ListNode newnode = new ListNode(val);

      }
  }

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
class Solution3 {
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

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/solutions/2739604/java-99-faster-simple-solution/

//https://leetcode.com/problems/plus-one/


