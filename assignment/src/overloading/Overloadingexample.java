package overloading;

public class Overloadingexample {
    public static double area(double side){
        return side * side;
    }

    public static double area(double length, double breadth){
        return length*breadth;
    }

    public static double area(float radius, float height){
        return Math.PI * radius* radius * height;
    }

    public static float area(float radius){
        return (float) Math.PI * radius * radius;
    }

    public static float area(double height , float base){
        return (float) (1/2 * (height * base));
    }
}