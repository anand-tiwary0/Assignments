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
        if(head == null){
            head = node;
            node.next = null;
            return;
        }
        node.next = head;
        head = node;
        size = size+1;
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
        if(head == null) {
            insertfirst(value);
            size++;
            return;
        }
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
        }
        temp = node;
        node.next = null;
        size++;
    }


}
