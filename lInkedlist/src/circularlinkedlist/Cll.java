package circularlinkedlist;

public class Cll {
    private static Node head;
    private static int size;
    public Cll(){
        this.size = 0;
    }


    //insertfirst
    public void insertfirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            head.next = node;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
        size++;
    }


    //display the list
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


    //recursive function to display list
    public void displaylist(){

    }
    private class Node{
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
}
