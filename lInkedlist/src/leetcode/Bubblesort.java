package leetcode;

import java.util.List;

public class Bubblesort {
    public static void main(String[] args) {
        ListNode list = new ListNode();
    }
    public static void bubblesort(ListNode list){
        int size = getsize(list);
        head = list;
        helper(list,size-1,0);
    }
    public static int getsize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        tail = temp;
        return size+1;
    }

    public static ListNode head;
    public static ListNode tail;
    public static void helper(ListNode list,int row,int col){
        if(row == 0){
            return;
        }
        if(row>col){
            ListNode first = getNode(list,col);
            ListNode second = getNode(list,col + 1);
            if(first.val > second.val){
                //swap there are three cases when these elements are at tail or head or in between
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail ){
                    ListNode previous = getNode(list,col-1);
                    previous.next = second;
                    second.next = first;
                    tail = first;
                    first.next = null;
                }else{
                    //now elements are in between
                    ListNode previous = getNode(list,col-1);
                    previous.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            helper(list,row,++col);
        }
        else{
            row = row-1;
            col = 0;
            helper(list,row,col);
        }
    }

    private static ListNode getNode(ListNode list,int i) {
        ListNode temp = list;
        ListNode currentnode = null;
        while(i>=0){
            currentnode = temp;
            temp = temp.next;
            i--;
        }
        return currentnode;
    }
}
