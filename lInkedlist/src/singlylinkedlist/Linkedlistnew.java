package singlylinkedlist;

public class Linkedlistnew {
    private Node head;
    private int size;

    public Linkedlistnew() {
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value){
            this.value = value;
        }
    }

    public void insertfirst(int value){
        Node node = new Node(value);
        size++;
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
//        size = size+1;
    }

    public void display(){
        if(head == null){
            return;
        }
        Node temp = head;
        do{
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while(temp != null);
        System.out.println("END");
    }


    public void insertlast(int value){
        Node node = new Node(value);
        size++;
        if(head == null) {
            insertfirst(value);
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int index, int value){
        Node node = new Node(value);
        size++;
        if(index==0) {
            insertfirst(value); return;
        }
        if(index == size-1){
            insertlast(value); return;
        }
        Node temp = head;
        if(index>0 && index<size-1){
            //then just traverse till the node which is previous and do changes accordingly
            for(int i=1; i<index;i++){
                temp = temp.next;
            }
            //now we are at the previous index
            node.next = temp.next;
            temp.next = node;

        }
    }

    public void displayrev(){
        Node temp = head;
        helper(temp);
        System.out.println("END");
    }

    private void helper(Node temp){
        if(temp == null){
            return;
        }
        if(temp.next == null){
            System.out.print(temp.value + " -> ");
            return;
        }
        helper(temp.next);
        System.out.print(temp.value + " -> ");
    }

    //now deletion operations
    

}
