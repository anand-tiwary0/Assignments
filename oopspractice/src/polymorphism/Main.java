package polymorphism;

public class Main {
    public static void main(String[] args) {
        //type of ref var decides what it can access but which one it can access is decided by type of object
        //their are two type of polymorphism - static polymorphism that can achieved by function overriding

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();

        square.area();
    }
}
