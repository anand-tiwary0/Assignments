public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;  //this is pointing to end of queue we are adding an item then increasing the end
    protected int front = 0;
    private int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        data = new int[size];
    }

    boolean isfull() {
        return size == data.length; //pointer is at last index
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int value) throws Exception {
        if(isfull()){
            throw new Exception("queue is full!!");
        }
        data[end++] = value;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        //now due to circular nature of queue we don't need to shift the element
        //just move the front forward
        if(isEmpty()){
            throw new Exception("queue is empty!!");
        }
        int removed = data[front++];
        front = (front)%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "<--");
            i = ++i % data.length;
        }while(i != end);
        System.out.println("END");
    }
}
