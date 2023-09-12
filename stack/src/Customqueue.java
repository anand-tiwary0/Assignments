public class Customqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;  //this is pointing to end of queue we are adding an item
    // then increasing the end

    public Customqueue() {
        this(DEFAULT_SIZE);
    }
    public Customqueue(int size){
        data = new int[size];
    }

    boolean isfull() {
        return end == data.length; //pointer is at last index
    }
    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if(isfull()){
            return false;
        }
        data[end++] = item; //put the data at the space pointed by end and then just
        // increase n to point to next space
        return true;
    }

    //removing element involves shifting of n item to left by 1 unit so O(N) time
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty!!");
        }
        int removed = data[0];
        //shift all items to left by one unit
        for(int i=1; i< end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i =0; i<end; i++){
            System.out.print(data[i] + " <-- ");
        }
        System.out.println("END");
    }
}
