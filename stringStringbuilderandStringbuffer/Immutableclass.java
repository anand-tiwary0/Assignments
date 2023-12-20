package stringStringbuilderandStringbuffer;

public class Immutableclass {
    private int i;
    public Immutableclass(int i){
        this.i = i;
    }

    //this function is the actual cause of immutability of this class
    //all function in the classes whose objects are immutable are implemented like this
    // so they will return same object if no change and if change is there these function will return new object
    public Immutableclass modify(int i){
        if(this.i == i){
            return this;
        }
        return new Immutableclass(i);
    }

    public static void main(String[] args) {
        Immutableclass t1 = new Immutableclass(10);
        Immutableclass t2 = t1.modify(10);
        Immutableclass t3 = t1.modify(20);
        System.out.println(t1 == t2); //true
        System.out.println(t3 == t1); //false
    }
}
