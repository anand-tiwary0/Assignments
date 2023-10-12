package ca3;

public class Over {
    int a;
    float b;
    String c;

    public Over() {
        this.a = -1;
        this.b = -1;
    }
    // this class have 3 constructor functions which are overloaded with each having different behaviour
    // the determination which function will run is based on parameters and context in which function is called
    public Over(int a, float b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
        //here toString() function which is inherited from Object class is being overridden
    @Override
    public String toString() {
        return "Over{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                '}';
    }

    public Over(int a, float b) {
        this.a = a;
        this.b = b;
        this.c = "default";
    }

    public void first(){
        System.out.println("this is form parent");
    }
}
class Child1 extends Over {
    String child_name1;

    public Child1(String child_name1) {
        this.child_name1 = child_name1;
    }

    @Override
    public void first(){
        System.out.println("this is from first child");
        System.out.println(this.child_name1);
    }
}
class Child2 extends Over{
    String child_name2;

    public Child2(String child_name2) {
        this.child_name2 = child_name2;
    }
    @Override
    public void first(){
        System.out.println("this is from second child");
        System.out.println(this.child_name2);
    }
}

class Mainofthis{
    public static void main(String[] args) {
        //here type of reference variable don't decide which version of function will be called instead
        // the type of reference variable decides which version of the function will be called
        // so which version of first() will be called based on type of object
        Over first = new Child2("second child");
        first.first();
        Over second = new Child1("first child");
        second.first();
        Over third = new Over();
        // here it is certain at compile time regarding which version of constructor will be called
        Over fourth = new Over(2,3,"fourth");
        System.out.println(fourth);
        third.first();

    }
}
