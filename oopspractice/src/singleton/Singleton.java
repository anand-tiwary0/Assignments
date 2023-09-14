package singleton;

public class Singleton {
    //lets create class which allows only one obj

    //first of all make it's constructor private

    private Singleton() {
    }

    //now let's make private instance varible that can accessed via a
    //instance return var

    private static Singleton instance; //for now this will be null

    //now lets make a function that creates an object of type Singleton and
    //passes it's refernce to instance if instance == null

    int i = 0;

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }
}
