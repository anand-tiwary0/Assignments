package singlylinkedlist;
import singlylinkedlist.Linkedlistnew;

public class Reverserec extends Linkedlistnew{
    public static void main(String[] args) {
        Linkedlistnew list = new Linkedlistnew();
        list.insertlast(5);
        list.insertlast(4);
        list.insertlast(3);
        list.insertlast(2);
        list.insertlast(1);
        list.display();
        reverserec(list);
        list.display();
    }

    static void reverserec(Linkedlistnew list){
        Node tail = list.tail();
        helper(list,list.head,tail);
    }

    static void helper(Linkedlistnew list,Node head,Node tail){
        Node temp = head;
        if(temp == tail){
            head = temp;
            return;
        }
        head = head.next;
        helper(list,head,tail);
        tail.next = temp;
        temp.next = null;
        tail = temp;
    }
}
