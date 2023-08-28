package circularlinkedlist;

public class Cllwithtails {

    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Cllwithtails() {
        this.size = 0;
    }


    public void display(){
        if(head == null){
            System.out.println("nothing to display");
            return;
        }
//        Node temp = head;
//        do {
//            System.out.print(temp.value + " --> ");
//            temp = temp.next;
//        } while(temp != head);
//        System.out.println("HEAD");
        Node temp = head;
        do{
            System.out.print(temp.value + " - >");
            temp = temp.next;
        }while(temp != head);
    }

    //insertfirst
    public void insertfirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;
        size++;
    }

    public void delete(int target){
        if(head == null){
            return;
        }
        Node node = head;
        if(head.value == target){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == target){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }
}
