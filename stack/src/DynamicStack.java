public class DynamicStack extends Customstack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int value) {
        if(this.isfull()){
            //double the array size
            int[] temp = new int[data.length * 2];
            //copy all elements
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }

            data = temp;
        }
        //as till this point it is taken care if structure is full or not
        //so now we can simpy push item
        return super.push(value);
    }
}
