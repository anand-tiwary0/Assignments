package singlylinkedlist;

public class Linkedlistcustom {
    //creating node which should be private
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
    private static Node head;
    private static Node tail;
    private static int size;

    public Linkedlistcustom() {
        this.size = 0;  //this will be used as total number of inserted item
    }

    //insert first
    public void insertfirst(int val){
        //creat node
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
        size++;
    }

    public void insertlast(int val){
        //create node
        Node node = new Node(val);
        if(head == null){
            insertfirst(val);
            return;
        }
        //now travel to place where we have to add
        Node temp = head;
        //we have to go till 2nd last element
        while(temp != null){
            temp = temp.next;
        }
        temp = node;
        node.next = null;
        size++;
    }

    public void insert(int index, int value) throws Exception {
        if(index == 0){
            insertfirst(value);
            return;
        }
        if(index == size){
            insertlast(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        if(index>0 && index<size){
            //move up to previous index
            for(int i=1; i<index; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
        else{
            throw new Exception("out of bound insertion tried");
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
