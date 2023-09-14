package staticinsubclass;

public class Main {
    public static void main(String[] args) {

        Staticinsubclass.Subclass objjj = new Staticinsubclass.Subclass(56,345);
        Main obj = new Main();
        obj.fun2();
    }

    static void fun(){
        //greeting(); //here we can't use greeting because function we are using
        //depends upon instance but the function in which we are using it does
        //not depends upon instance

        //we can't access non-static stuffs without referencing their instance
        // in a static context
        Main obj = new Main();
        obj.greeting();
    }


    void fun2(){
        greeting();
    }

    void greeting(){
        fun();
        System.out.println("hello world!");
    }

}
