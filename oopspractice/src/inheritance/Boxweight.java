package inheritance;

public class Boxweight extends Box{  //final classes can't be inherited
    double weight;
    //simple constructor without mention of super class default super will  be called
    public Boxweight(double weight) {
        this.weight = weight;
    }
    Boxweight(){
        this.weight = -1;
    }
    //suppose we have another object through which we want to initialize
    public Boxweight(Boxweight other){
        super(other);
        this.weight = other.weight;
    }
    public Boxweight(double l, double h, double w, double weight) {
        //super keyword is used to point to immediate parent class
        super(l, h, w);  //this is a call to parent constructor;
//        System.out.println(super.weight); //to access parent class weight
        this.weight = weight;
    }
    public Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    //let's try overriding overridetest
    static void overridetest(){
        System.out.println("this overrides the parent method but it will not because it is static method");
    }
    //final is also used to prevent overriding
    //a final function can't be overridden
//   public void greeting() {
//        System.out.println("hey, I am in Boxweight class. Greetings");
//    }
}
