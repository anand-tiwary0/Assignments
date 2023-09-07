package questions;

public class LL {
    private int size;
    private Node head = null;
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public LL() {
        this.size = 0;
    }

    public void insertlast(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            this.size++;
            return;
        }
        else{
            Node current = this.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
            this.size++;
            return;
        }
    }

    public void insertfirst(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            this.size++;
            return;
        }
        else{
            newnode.next = head;
            head = newnode;
            this.size++;
        }
    }

    public void insertrec(int index,int value){
        head = helper(index,value,this.head);
    }
    public Node helper(int index,int value,Node nextnode){
        if(index == 0){
            //that is when we are at the point where we want to insert
            Node newnode = new Node(value,nextnode);
            this.size++;
            return newnode;
        }
        else{
            nextnode.next = helper(--index,value,nextnode.next);
            return nextnode;
        }
    }


    public void display(){
        Node temp = this.head;
//        System.out.println(temp.val);
        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertfirst(34);
        list.insertfirst(334);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertrec(2,78);
        list.insertlast(45546);
        list.display();
    }


}
