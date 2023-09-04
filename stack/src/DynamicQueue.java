public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    //we have problem with array getting full

    @Override
    public boolean insert(int value) throws Exception {
        //if getting full create new array of twice size
        if(super.isfull()){
            int[] temp = new int[2*data.length];
//
//            for(int i=0; i<data.length; i++){
//                temp[i] = data[(front+i)%data.length];
//            }
//            front = 0;
//            end = data.length;
//            data = temp;
            int i = front;
            int j = 0;
            do{
                temp[j] = super.data[i++];
                i = i % super.data.length;
                j++;
            }while (i != front);
            front = 0;
            end = j;
            data = temp;
        }
        //now case of full is handelled now simply insert
        super.insert(value);
        return true;
    }
}
