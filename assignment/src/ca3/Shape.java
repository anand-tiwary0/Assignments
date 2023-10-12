package ca3;

public class Shape {
    public Shape() {
    }

    void area(){
        System.out.println("I am in shapes");
    }
}

class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    void area(){
        System.out.println("Area of circle is = " + Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void area(){
        System.out.println("Area of Rectangle is = " + length*breadth);
    }
}

class Triangle extends Shape{
    int height;
    int base;
    public Triangle(int height, int base){
        this.height = height;
        this.base = base;
    }
    @Override
    void area(){
        System.out.println("Area of Triangle = "+ 1/2 *(this.base * this.height));
    }
}

class Main{
    public static void main(String[] args) {
        // here reference variable is of type Shape but Object is of type Triangle
        // so here the Overridden method which is associated with Triangle class will be
        // called so the Overridden method which will be called is decided at runtime based
        // on the type of Object not on the type of reference variable
        Shape triangle = new Triangle(34,34);
        triangle.area();

        Shape rectangle = new Rectangle(34,23);
        rectangle.area();
    }
}