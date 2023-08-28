package doublylinkedlist;

public class Dll {

    public void insert(int index,int value) throws Exception {

        if(index<0 || index>=size){
            throw new Exception("trying to insert at out of bound");
        }
        if(index==0) {
            insertfirst(value);
            return;
        }
        if(index == size-1){
            insertlast(value);
            return;
        }
        Node node = new Node(value);
        Node previous = getnodebyindex(index-1);
        node.next = previous.next;
        previous.next = node;
        node.pre = previous;
        node.next.pre = node;
        size++;

    }

    public void insertfirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            size++;
            return;
        }
        node.next = head;
        head.pre = node;
        head = node;
        size++;
    }

    public void insertlast(int value){
        if(head == null){
            insertfirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = node;
//        size++;

        Node lastnode = getnodebyindex(size-1);
        lastnode.next = node;
        node.pre = lastnode;
        size++;
    }

    private Node getnodebyindex(int index){
        if(index<0 || index>=size){
            return null;
        }
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }


    public void display(){
        if(head == null) return;
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    //removed
    public int removelast(){
        if(head == null){
            return -1;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        int value = temp.value;
        //here temp is pointing to last node
        Node previous = temp.pre;
        previous.next = null;
        size--;
        return value;
    }


    public int removefirst(){
        if(head == null) return -1;
        int value = head.value;
        head = head.next;
        head.pre = null;
        size--;
        return value;
    }


    //remove by index
    public int remove(int index){
        if(index<0 || index>=size){
            return -1;
        }
        if(index == 0) {
            return removefirst();
        }
        if(index == size-1){
            return removelast();
        }

        Node current = getnodebyindex(index);
        int value = current.value;
        current.pre.next = current.next;
        current.next.pre = current.pre;
        size--;
        return value;
    }
    private int size;  //to indicate total number of element present in the list for now
    public Dll() {
        this.size = 0;
    }

    private Node head;

    private class Node {
        int value;
        Node next;
        Node pre;

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }

        public Node(int value) {
            this.value = value;
        }
    }

}

