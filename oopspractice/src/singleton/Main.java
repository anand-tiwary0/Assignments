package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        obj1.i = 3;

        if(obj2==obj1){
            System.out.println("True");
        }else {
            System.out.println("false");
        }

        System.out.println(obj1.i);
        System.out.println(obj2.i); //here all three statements will print same as all are pointing to same object
        System.out.println(obj3.i);
    }

    public static class Staticinsubclass {
    }
}
