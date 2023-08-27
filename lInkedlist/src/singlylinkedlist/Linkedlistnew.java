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
    public int deletefirst(){
        int value = head.value;
        head = head.next;
        size = size-1;
//        System.out.println("size"  + size);
        return value;
    }

    public int deletelast(){
        //
        if(head.next == null){
            head = null;
            return head.value;
        }
//        System.out.println("tset size " + size);
        Node node = getnodebyindex(size-2);
        int toreturn = node.next.value;
//        System.out.println(node.value);
        node.next = null;
        size = size-1;
        return toreturn;
    }


    public Node getnodebyindex(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }


    public int delete(int index) throws Exception {
        int value = 0;
        if (index<0 || index>size-1){
            throw new Exception("index out of bound for this list");
        }
        else{
            if(index == 0) {
                return deletefirst();
            }
            if(index == size-1){
                return deletelast();
            }
            //otherwise
            Node utility = getnodebyindex(index-1);
            value = utility.next.value;
            utility.next = utility.next.next;
        }
        size = size -1;
        return value;
    }

}
