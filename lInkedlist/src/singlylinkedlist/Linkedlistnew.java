package singlylinkedlist;

public class Linkedlistnew {
    public static Node head;
    private static int size;

    public Linkedlistnew() {
        this.size = 0;
    }

    public class Node{
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

    //insert using recursion
    public void insertRec(int val,int index){
        head = insertRecutil(val,index,this.head);
    }
    private Node insertRecutil(int val,int index,Node current){
        if(index == 0)   //this is the place where we will be inserting
        {
            Node temp = new Node(val);
            temp.next = current;
            size++;
            return temp;
        }
        current.next = insertRecutil(val,index-1,current.next);
        return current;
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

    public static Node tail(){
        Node lastnode = getnodebyindex(size-1);
        return lastnode;
    }

    public static Node tail = tail();
    //recursive reversal of linked list
    public static void reverselist(Node node){
        if(node == null || node == tail){
            head = node;
            return;
        }
        reverselist(node.next);
        tail.next = node;
        node.next = null;
        tail = node;
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


    public static Node getnodebyindex(int index){
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
