public class Customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public boolean push(int value){
        if(isfull()){
            System.out.println("stack is full1");
            return false;
        }
        ptr++;  //increase the pointer
        data[ptr] = value;   //add the item
        return true;
    }

    boolean isfull() {
        return ptr == data.length-1; //pointer is at last index
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("can't pop from empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("can't peek from empty stack!!");
        }
        return data[ptr];
    }

    public Customstack(){
        this(DEFAULT_SIZE);
    }
    public Customstack(int size) {
        this.data = new int[size];
    }
}
