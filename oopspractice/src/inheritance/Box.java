package inheritance;

public class Box {
    //test codes
//    private double weight;
    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                ", l=" + l +
                ", h=" + h +
                ", w=" + w +
                '}';
    }

    private int t;
    public int getT() {
        return t;
    }
    double l;
    double h;
    double w;
    //test methods
    //static functions can be inherited but can't be overriden(because it makes no sense parent block method will always be
    //called as it makes no sense to have maultiple static overrideen methods because they are independent of objects so

//    @Override   static methods can't be annotated with override
    static void overridetest(){
        System.out.println("this is for override test");
    }
    final public void greeting(){
        System.out.println("hey, I am in Box class. Greetings!");
    }
    public void greeting(int a){
        System.out.println("hey");
    }
    Box(){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public Box(double l, double h, double w) {
        System.out.println("box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
}
