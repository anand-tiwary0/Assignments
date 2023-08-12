package inheritance;
class Superclass{
    int a;
    float b;
    public Superclass(int a, float b) {
        this.a = a;
        this.b = b;
    }
}
class Subclass extends Superclass{
    int c;
    Subclass(int a,float b,int c){
        super(a,b);
        this.c = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Subclass obj1 = new Subclass(23,432.3f,45);
        //this obj1 have access to properties and functions of base Superclass
        System.out.println(obj1.a + " " + obj1.b + " " + obj1.c);
    }
}
